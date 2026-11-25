# SehatKu for Android

A small native shell around the SehatKu web app (`../SehatKu.html`), built without Android Studio or Gradle.

- `src/…/MainActivity.java` runs a WebView that serves the bundled app from `https://appassets.androidplatform.net/SehatKu.html`, so saved data stays put when the app downloads a newer `SehatKu.html` (in-app **Perbarui**). It also handles the backup save dialog, the file picker, external links and the back button.
- `AndroidManifest.xml`, `res/` contain the manifest, theme and launcher icons (adaptive plus legacy).
- `app.json` holds `versionCode` / `versionName`.
- `build_apk.py` runs aapt2 → javac → d8 → zipalign → apksigner and writes `build/SehatKu.apk`.

Download the latest build: [https://github.com/sdel0ng/sehatku/releases/latest/download/SehatKu.apk](https://github.com/sdel0ng/sehatku/releases/latest/download/SehatKu.apk)

Building requires JDK 17, Android build-tools 34.0.0, platform android-34 and the maintainer's private signing key (see the header of `build_apk.py`). The key is not part of this repository.
