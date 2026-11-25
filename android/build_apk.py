"""Build SehatKu.apk without Android Studio/Gradle.

Steps: aapt2 (resources + manifest) -> javac -> d8 (dex) -> zip -> zipalign -> apksigner.

Tools are looked up in SEHATKU_ANDROID_TOOLS (default: ../../tools/android next to the project):
  jdk/jdk-17*/                    Temurin JDK 17
  sdk/build-tools/34.0.0/         Android build-tools 34
  sdk/platforms/android-34/       Android platform 34 (android.jar)
  keystore/sehatku-release.jks    release signing key  (private - never commit)
  keystore/keystore-password.txt  its password         (private - never commit)

Usage:  python build_apk.py            -> build/SehatKu.apk
"""
import json
import os
import re
import shutil
import subprocess
import sys
import zipfile
from pathlib import Path

HERE = Path(__file__).resolve().parent
WEB_APP = HERE.parent / "SehatKu.html"
TOOLS = Path(os.environ.get("SEHATKU_ANDROID_TOOLS", HERE.parent.parent / "tools" / "android"))
BUILD = HERE / "build"


def find_tools():
    jdk = next((TOOLS / "jdk").glob("jdk-17*"), None)
    build_tools = TOOLS / "sdk" / "build-tools" / "34.0.0"
    android_jar = TOOLS / "sdk" / "platforms" / "android-34" / "android.jar"
    keystore = TOOLS / "keystore" / "sehatku-release.jks"
    password = TOOLS / "keystore" / "keystore-password.txt"
    missing = [str(p) for p in (jdk, build_tools, android_jar, keystore, password) if p is None or not Path(p).exists()]
    if missing:
        sys.exit("Missing tools: " + ", ".join(missing))
    return jdk, build_tools, android_jar, keystore, password


def run(args, env):
    result = subprocess.run([str(a) for a in args], capture_output=True, text=True, env=env)
    if result.returncode != 0:
        sys.exit(f"Command failed: {' '.join(str(a) for a in args)}\n{result.stdout}\n{result.stderr}")
    return result.stdout


def build():
    jdk, bt, android_jar, keystore, password_file = find_tools()
    env = dict(os.environ, JAVA_HOME=str(jdk), PATH=str(jdk / "bin") + os.pathsep + os.environ.get("PATH", ""))
    app = json.loads((HERE / "app.json").read_text(encoding="utf-8"))
    html = WEB_APP.read_text(encoding="utf-8")
    web_version = re.search(r"const APP_VERSION = '([\d.]+)';", html).group(1)

    if BUILD.exists():
        shutil.rmtree(BUILD)
    for folder in ("assets", "classes", "dex", "src"):
        (BUILD / folder).mkdir(parents=True)

    # 1. Web app as an asset
    shutil.copyfile(WEB_APP, BUILD / "assets" / "SehatKu.html")

    # 2. Resources + manifest
    run([bt / "aapt2.exe", "compile", "--dir", HERE / "res", "-o", BUILD / "res.zip"], env)
    run([bt / "aapt2.exe", "link", "-I", android_jar, "--manifest", HERE / "AndroidManifest.xml",
         "-A", BUILD / "assets", "-o", BUILD / "base.apk", BUILD / "res.zip",
         "--min-sdk-version", "24", "--target-sdk-version", "34",
         "--version-code", str(app["versionCode"]), "--version-name", app["versionName"]], env)

    # 3. Java -> classes -> dex (the bundled web version is written into the source)
    sources = []
    for java in (HERE / "src").rglob("*.java"):
        target = BUILD / "src" / java.relative_to(HERE / "src")
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_text(java.read_text(encoding="utf-8").replace("@BUNDLED_VERSION@", web_version), encoding="utf-8")
        sources.append(target)
    run([jdk / "bin" / "javac.exe", "-encoding", "UTF-8", "-source", "8", "-target", "8", "-nowarn",
         "-bootclasspath", android_jar, "-classpath", android_jar, "-d", BUILD / "classes", *sources], env)
    classes = list((BUILD / "classes").rglob("*.class"))
    run([bt / "d8.bat", "--release", "--min-api", "24", "--lib", android_jar, "--output", BUILD / "dex", *classes], env)

    # 4. Add classes.dex (keep aapt2's compression choices, e.g. resources.arsc stored)
    unaligned = BUILD / "unaligned.apk"
    with zipfile.ZipFile(BUILD / "base.apk") as src, zipfile.ZipFile(unaligned, "w") as out:
        for info in src.infolist():
            out.writestr(info, src.read(info.filename), compress_type=info.compress_type)
        out.write(BUILD / "dex" / "classes.dex", "classes.dex", compress_type=zipfile.ZIP_DEFLATED)

    # 5. Align + sign
    aligned = BUILD / "aligned.apk"
    run([bt / "zipalign.exe", "-p", "-f", "4", unaligned, aligned], env)
    apk = BUILD / "SehatKu.apk"
    sign_env = dict(env, SEHATKU_KS_PASS=password_file.read_text(encoding="utf-8").strip())
    run([bt / "apksigner.bat", "sign", "--ks", keystore, "--ks-key-alias", "sehatku", "--ks-pass", "env:SEHATKU_KS_PASS",
         "--key-pass", "env:SEHATKU_KS_PASS", "--out", apk, aligned], sign_env)
    verify = run([bt / "apksigner.bat", "verify", "--verbose", "--print-certs", apk], env)
    badging = run([bt / "aapt2.exe", "dump", "badging", apk], env)
    return apk, web_version, verify, badging


if __name__ == "__main__":
    apk, web_version, verify, badging = build()
    print(f"Built {apk} ({apk.stat().st_size:,} bytes) with web app {web_version}")
    print(badging.splitlines()[0])
    print(verify)
