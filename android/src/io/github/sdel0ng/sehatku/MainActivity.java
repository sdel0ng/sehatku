package io.github.sdel0ng.sehatku;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * SehatKu Android shell.
 *
 * The web app (assets/SehatKu.html) is served from a fixed virtual https address, so its
 * saved data (localStorage) stays in one place even after the app downloads a newer
 * SehatKu.html through the in-app "Perbarui" button.
 */
public class MainActivity extends Activity {
    static final String HOST = "appassets.androidplatform.net";
    static final String START_URL = "https://" + HOST + "/SehatKu.html";
    static final String UPDATE_PREFIX = "https://sdel0ng.github.io/sehatku/";
    static final String BUNDLED_VERSION = "@BUNDLED_VERSION@";  // filled in by build_apk.py
    static final int REQUEST_OPEN_FILE = 1;
    static final int REQUEST_SAVE_FILE = 2;

    private WebView web;
    private ValueCallback<Uri[]> fileCallback;
    private String pendingSave;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        getWindow().setStatusBarColor(Color.parseColor("#0f9d76"));
        web = new WebView(this);
        setContentView(web);

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        web.addJavascriptInterface(new Bridge(), "AndroidApp");

        web.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri uri = request.getUrl();
                if (HOST.equals(uri.getHost())) return false;
                openExternal(uri.toString());
                return true;
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Uri uri = request.getUrl();
                if (!HOST.equals(uri.getHost())) return null;
                String path = uri.getPath();
                if (path == null || path.equals("/") || path.equals("/index.html") || path.equals("/SehatKu.html")) {
                    return htmlResponse();
                }
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found",
                        new HashMap<String, String>(), new ByteArrayInputStream(new byte[0]));
            }
        });

        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view, ValueCallback<Uri[]> callback, FileChooserParams params) {
                if (fileCallback != null) fileCallback.onReceiveValue(null);
                fileCallback = callback;
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("*/*");
                try {
                    startActivityForResult(Intent.createChooser(intent, "Pilih file backup"), REQUEST_OPEN_FILE);
                } catch (ActivityNotFoundException e) {
                    fileCallback = null;
                    return false;
                }
                return true;
            }
        });

        if (savedState != null) web.restoreState(savedState);
        else web.loadUrl(START_URL);
    }

    // ---------------------------------------------------------------- web content

    private SharedPreferences prefs() {
        return getSharedPreferences("sehatku", MODE_PRIVATE);
    }

    private File updatedFile() {
        return new File(new File(getFilesDir(), "web"), "SehatKu.html");
    }

    /** Version of the downloaded SehatKu.html, or "" when the bundled copy is newer or missing. */
    private String downloadedVersion() {
        String version = prefs().getString("version", "");
        if (version.isEmpty() || !updatedFile().exists()) return "";
        return compareVersions(version, BUNDLED_VERSION) > 0 ? version : "";
    }

    private WebResourceResponse htmlResponse() {
        InputStream in = null;
        if (!downloadedVersion().isEmpty()) {
            try {
                in = new FileInputStream(updatedFile());
            } catch (IOException e) {
                in = null;
            }
        }
        if (in == null) {
            try {
                in = getAssets().open("SehatKu.html");
            } catch (IOException e) {
                return null;
            }
        }
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Cache-Control", "no-store");
        return new WebResourceResponse("text/html", "utf-8", 200, "OK", headers, in);
    }

    /** Downloads a newer SehatKu.html (from the official site only), checks it, then reloads. */
    private void fetchUpdate(String url, String version) {
        boolean ok = false;
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setUseCaches(false);
            if (conn.getResponseCode() == 200) {
                InputStream in = conn.getInputStream();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                byte[] chunk = new byte[16384];
                int read;
                while ((read = in.read(chunk)) > 0) {
                    buffer.write(chunk, 0, read);
                    if (buffer.size() > 8 * 1024 * 1024) throw new IOException("file too large");
                }
                in.close();
                byte[] data = buffer.toByteArray();
                String html = new String(data, StandardCharsets.UTF_8);
                if (html.contains("const APP_VERSION = '" + version + "';") && html.contains("</html>")) {
                    File dir = new File(getFilesDir(), "web");
                    if (!dir.exists() && !dir.mkdirs()) throw new IOException("no folder");
                    File temp = new File(dir, "SehatKu.html.tmp");
                    FileOutputStream out = new FileOutputStream(temp);
                    out.write(data);
                    out.close();
                    File target = updatedFile();
                    if (target.exists() && !target.delete()) throw new IOException("cannot replace");
                    ok = temp.renameTo(target);
                    if (ok) prefs().edit().putString("version", version).apply();
                }
            }
        } catch (Exception e) {
            ok = false;
        } finally {
            if (conn != null) conn.disconnect();
        }
        final boolean success = ok;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (success) web.loadUrl(START_URL);
                else web.evaluateJavascript("window.sehatkuUpdateFailed && window.sehatkuUpdateFailed()", null);
            }
        });
    }

    // ---------------------------------------------------------------- files

    private void startSave(String name, String content, String mime) {
        pendingSave = content;
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType(mime == null || mime.isEmpty() ? "application/octet-stream" : mime);
        intent.putExtra(Intent.EXTRA_TITLE, name);
        try {
            startActivityForResult(intent, REQUEST_SAVE_FILE);
        } catch (ActivityNotFoundException e) {
            pendingSave = null;
            notifyWeb("Perangkat ini tidak bisa menyimpan file");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_OPEN_FILE) {
            if (fileCallback != null) {
                Uri[] result = null;
                if (resultCode == RESULT_OK && data != null && data.getData() != null) result = new Uri[] { data.getData() };
                fileCallback.onReceiveValue(result);
                fileCallback = null;
            }
            return;
        }
        if (requestCode == REQUEST_SAVE_FILE) {
            String content = pendingSave;
            pendingSave = null;
            if (resultCode != RESULT_OK || data == null || data.getData() == null || content == null) return;
            try {
                OutputStream out = getContentResolver().openOutputStream(data.getData());
                if (out == null) throw new IOException("no stream");
                out.write(content.getBytes(StandardCharsets.UTF_8));
                out.close();
                notifyWeb("File tersimpan ✓");
            } catch (Exception e) {
                notifyWeb("Gagal menyimpan file");
            }
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    // ---------------------------------------------------------------- helpers

    private void notifyWeb(String message) {
        web.evaluateJavascript("window.sehatkuNotify && window.sehatkuNotify(" + JSONObject.quote(message) + ")", null);
    }

    private void openExternal(String url) {
        if (url == null || !(url.startsWith("https://") || url.startsWith("http://"))) return;
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        } catch (ActivityNotFoundException e) {
            notifyWeb("Tidak ada browser untuk membuka tautan");
        }
    }

    @SuppressWarnings("deprecation")
    private String appInfo() {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            JSONObject json = new JSONObject();
            json.put("apk", info.versionName);
            json.put("code", info.versionCode);
            json.put("bundled", BUNDLED_VERSION);
            String downloaded = downloadedVersion();
            json.put("content", downloaded.isEmpty() ? BUNDLED_VERSION : downloaded);
            return json.toString();
        } catch (Exception e) {
            return "{}";
        }
    }

    static int compareVersions(String a, String b) {
        String[] pa = a.split("\\.");
        String[] pb = b.split("\\.");
        for (int i = 0; i < Math.max(pa.length, pb.length); i++) {
            int x = i < pa.length ? parseNumber(pa[i]) : 0;
            int y = i < pb.length ? parseNumber(pb[i]) : 0;
            if (x != y) return x > y ? 1 : -1;
        }
        return 0;
    }

    static int parseNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        web.saveState(outState);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onBackPressed() {
        if (web.canGoBack()) web.goBack();
        else super.onBackPressed();
    }

    /** Methods callable from SehatKu.html as window.AndroidApp.* */
    class Bridge {
        @JavascriptInterface
        public String info() {
            return appInfo();
        }

        @JavascriptInterface
        public void saveFile(final String name, final String content, final String mime) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    startSave(name, content, mime);
                }
            });
        }

        @JavascriptInterface
        public void downloadUpdate(final String url, final String version) {
            if (url == null || version == null || !url.startsWith(UPDATE_PREFIX)) return;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fetchUpdate(url, version);
                }
            }).start();
        }

        @JavascriptInterface
        public void openExternal(final String url) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    MainActivity.this.openExternal(url);
                }
            });
        }
    }
}
