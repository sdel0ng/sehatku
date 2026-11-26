# SehatKu 🌿

**SehatKu** is a lightweight calorie & health tracker that runs entirely in the browser — a single HTML file, nothing to install. It works fully offline without an account; a free, optional account adds cloud sync between devices, friends, chat and pet visits. The interface is in Bahasa Indonesia.

Current version: **2.3** (see the [Changelog](#changelog)).

**▶️ Try it online: https://sdel0ng.github.io/sehatku/** — works on phones too. Without an account your data stays in your own browser; it is only uploaded if you sign in.

**📱 Android app: [download SehatKu.apk](https://github.com/sdel0ng/sehatku/releases/latest/download/SehatKu.apk)** (Android 7.0+, about 0.2 MB).

**💻 PC / laptop & 🍎 iPhone / iPad:** open the [online version](https://sdel0ng.github.io/sehatku/#pasang) and tap **📲 Pasang aplikasi**. See [Install on PC, iPhone & iPad](#-install-on-pc-iphone--ipad).

## Features

- **Beranda (dashboard)** — remaining calories for the day, protein/carbs/fat vs. targets, water intake, BMI, steps & sleep and automatic tips. It also shows the mascot **Bro Koli 🥦** (tap him for a joke), today's missions, your level and streak, this week's boss HP and a "Tahukah kamu?" fun fact. New players also get the 🎒 [Starter Pack](#starter-pack-v22) here.
- **Makanan (food log)** — 332 foods and drinks with typical portions and food emoji: everyday Indonesian dishes plus street food (*kaki lima*), cafés & coffee, restaurants, desserts, food courts & fast food and Chinese food. Search and 15 categories, manual entries saved to "Makanan saya", "same as yesterday", editable portions and undo on delete.
- **Aktivitas (exercise)** — 20 activities; calories from MET × body weight × duration; weekly active minutes vs. the WHO 150-minute guideline.
- **Berat (weight)** — weight & waist log, trend chart, kg/week trend, estimated goal date, BMI per Kemenkes RI, WHO Asia-Pacific or WHO.
- **Statistik** — 7/14/30-day averages, days on target, estimated deficit, macro split and top calorie sources.
- **Prestasi (achievements)** — level & XP, 🎁 level rewards (treasure chests, a 36-sticker album, outfits for Bro Koli and colour themes), streaks, daily missions, a 12-week calendar heatmap and 30 badges with progress.
- **Seru (fun)** — the Tangkap Sayur arcade game, weekly boss battle, the Tebak Kalori quiz, the Peta Nusantara journey map, Bro Koli's joke corner and "Statistik Kocak" (see below).
- **Teman (friends)** — with a free account: 🌏 **Ruang publik** (everyone on SehatKu, add friends with one tap), chat, pet visits and friends' houses (see [below](#-accounts-friends-chat--pet-visits)).
- **Profil** — personal data and targets, ☁️ account & sync, JSON backup/restore, CSV export for Excel and 📲 **Pasang aplikasi**, with install buttons for Android, iPhone/iPad and PC.

## Gamification

Everything is calculated from what you already log; there is nothing extra to fill in.

- **Bro Koli 🥦 (mascot)** — reacts to your day (on target, over budget, thirsty, late night, streak at risk, all missions done …) with a changing face and light-hearted lines.
- **XP & levels** — earn XP every day. Level *L* needs 50 × L × (L − 1) total XP (Lv 2 = 100, Lv 3 = 300, Lv 4 = 600 …). There are 12 titles, from 🌱 *Bibit Sehat* to 🏆 *Legenda Hidup Sehat*.
- **Streaks** — 🔥 food-logging streak and 🎯 on-target streak, current and best. The flame greys out until today has been logged.
- **Daily missions** — 4 per day. Two are fixed (log 3 main meals, reach the water target) and two rotate daily from: protein, 30 min exercise, steps, vegetables, fruit, no fried food, no sugary drinks, 7–9 h sleep and calories on target.
- **30 badges** — e.g. 🍽️ Suapan Pertama, 🔥 Api Kecil, 🐟 Ikan Mas, 💪 Otot Kawat Tulang Besi, 👣 Kaki Seribu, 🙅 Detoks Gorengan, ⭐ Hari Sempurna, 🧠 Ahli Gizi KW, ⚔️ Pemburu Boss, 🎈 Kilo Pertama, 👑 Target Tercapai!
- **Celebrations** — a confetti popup for boss wins, level-ups, new cities on the map, new badges and perfect days. Sound is **off by default** (toggle it on the Prestasi or Seru tab). Animations are skipped when the system's *reduce motion* setting is on.
- **Small extras** — remaining calories shown as food equivalents (e.g. "≈ 2 🍌 pisang goreng"), the walking minutes needed to burn a food before you add it, exercise expressed in pisang goreng, and an animated water glass.

### Seru tab (v1.2)

- **🕹️ Tangkap Sayur** (v1.4) — move Bro Koli to catch falling veggies, fruit and fish, grab ⭐ bonuses and dodge gorengan, donuts and sweet drinks (three hits and it's over). Five catches in a row give a ×2 combo, ten give ×3. Every 50 points = 1 XP, up to 20 XP per day.
- **👹 Boss Mingguan** — a new villain every Monday: Raja Gorengan, Ratu Gula, Si Mager, Hantu Begadang, Naga Boba, Tuyul Ngemil, Monster Micin and Genderuwo Porsi Jumbo (550–650 HP). Each healthy habit you log is an attack. Logging food 10, three main meals 15, calories on target 30, protein 20, water 20, exercise 15 (+15 if ≥ 30 min), steps 20, sleep 15, vegetables 10, fruit 10, no fried food 15 and no sugary drinks 15. Each boss has two weaknesses that deal double damage. Beat it before Sunday midnight for +100 XP and a trophy.
- **🧠 Tebak Kalori** — "which has more (or fewer) calories?" with two foods from the database. Pairs get closer as your streak grows. Each correct answer gives +2 XP, up to 20 XP per day.
- **🗺️ Peta Nusantara** — progress toward your goal weight is a trip through 16 cities from Sabang to Merauke, with a celebration at every new city. In maintain mode the trip advances with days logged instead (90 days = Merauke).
- **😂 Pojok Bro Koli** — pantun, riddles (*tebak-tebakan*) and cheesy health pick-up lines; tapping Bro Koli on the dashboard tells one too.
- **📈 Statistik Kocak** — lifetime totals in fun units: water in refill gallons, steps in football pitches, exercise calories in pisang goreng, sleep in movies and kg in 1 kg sugar packs.

### Level rewards (v1.4)

- **Every level-up:** a 🎁 *Peti Harta* (treasure chest). Opening it gives a sticker for the **Album Stiker Nusantara**: 36 stickers of Indonesian food, animals, places and legends in four rarities (Biasa 60 %, Langka 28 %, Epik 10 %, Legendaris 2 %). Duplicates turn into ⭐ stars; 5 stars buy a new sticker. A chest's content is fixed by its number, so it's the same on every device.
- **Unlocks along the way:** outfits for Bro Koli (🧢 Lv 3, 🎀 Lv 5, 👒 Lv 7, ⛑️ Lv 13, 🌺 Lv 15, 🎓 Lv 25) and colour themes (Laut Biru Lv 5, Malam Galaksi Lv 15).
- **Big rewards:**
  - **Lv 10:** Senja Bali theme, 🎩 Topi Tinggi and a *Peti Emas* (Epik or better).
  - **Lv 20:** 👑 Mahkota Sultan, Emas Keraton theme and a *Peti Legendaris*.
  - **Lv 30:** 🌟 Bintang Legenda, Kembang Sepatu theme and a *Peti Legendaris*.
  - **Every 10 levels after that:** a new trophy plus a *Peti Legendaris*.
- Existing players receive the chests for every level they had already reached.

| Earn XP for | XP |
|---|---|
| Logging food (at least 1 item) | 10 |
| Logging breakfast, lunch and dinner | 10 |
| Calories on target (80–105 % of the day's budget)\* | 20 |
| Protein ≥ 90 % of target | 15 |
| Water target reached | 15 |
| Any exercise (+10 more if ≥ 30 min) | 10 |
| Steps ≥ target | 10 |
| Sleep 7–9 h | 10 |
| Each daily mission completed | 10 |
| All missions completed (Hari Sempurna) | +20 |
| Correct answer in Tebak Kalori (max. 20 XP/day) | 2 |
| Defeating the weekly boss | 100 |
| Tangkap Sayur: every 50 points (max. 20 XP/day) | 1 |
| Weigh-in (max. once per week) | 15 |
| Each badge unlocked | 50 |
| Starter Pack mission (new players, once each) | 50–150 |
| All Starter Pack missions claimed (once) | 300 |

\* The budget includes exercise credit. A day counts once breakfast, lunch and dinner are logged, or once the day is over.

### Starter Pack (v2.2)

New players get a 🎒 **Starter Pack** card at the top of Beranda: a checklist of first steps that each give extra XP once. When a step is done, tap **Klaim**. The first one, the welcome gift, is free and lifts you straight to Level 2, so your first treasure chest is ready right away.

| Starter mission | XP |
|---|---|
| 🎁 Claim the welcome gift | 100 |
| 👤 Complete your profile & targets | 100 |
| 🍽️ Log one food | 100 |
| 💧 Log one glass of water (one-tap button on the card) | 50 |
| 🏃 Log one exercise | 100 |
| ✅ Finish one daily mission | 100 |
| 🐾 Adopt your first pet | 100 |
| 🧰 Open one treasure chest | 100 |
| 🎮 Play one game (Tangkap Sayur or Tebak Kalori) | 100 |
| 🌐 Create an account & username\*\* | 150 |
| 🤝 Add one friend\*\* | 150 |
| **Bonus when every mission is claimed** | **300** |

\*\* Only shown when the account features are available.

That adds up to 1,150 XP (1,450 with an account), enough for about Level 5 on the first day on top of the normal daily XP. The card disappears once everything is claimed. Players already at Level 10 or higher who haven't started it don't see it. Claimed missions sync with your account and never count twice.

### Pet asisten (v1.6)

- **Adopt a pet** in the new 🐾 **Pet** tab. It lives on the dashboard as your assistant: it reminds you to log meals and drink water (with a one-tap **+1 gelas**), protects your streak, points to unfinished missions, unopened chests and the weekly boss, and suggests a walk when you go over budget.
- **Grows with your level:** Bayi (Lv 1) → Remaja (Lv 4) → Dewasa (Lv 10, with a scarf) → Legenda (Lv 20, with a crown).
- **15 pets, more choices as you level up:** Kucing Oyen, Kelinci and Anak Ayam at the start, then Anak Anjing (Lv 2), Hamster (4), Panda (6), Kodok (8), Penguin (10), Rubah (12), Kukang (14), Kura-kura (17), Komodo (20), Harimau Sumatra (25), Naga Antaboga (30) and Garuda Emas (40). New pets and growth stages appear on the level-reward track. Switch pets any time; each keeps its own name.
- **🫧 Floats with you:** the pet floats over the app and follows you to whichever tab you open — it hops over to sit on the active tab (bottom bar on phones, beside the menu on wide screens), its eyes follow your finger or mouse, and it reacts when you log food, water, exercise or weight and when you level up. Tap it for a tip, drag it aside if it's in the way, or switch floating off in the Pet tab. It goes home when you open the Pet tab and disappears while you play Tangkap Sayur.
- **🛋️ Furniture for every level:** each level-up adds furniture to the pet's house — 36 pieces from a 🪴 plant and 🖼️ painting at the start, 🛋️ sofa (Lv 5), 📺 TV (Lv 10) and 🎹 piano (Lv 15) up to ⛲ fountain (Lv 20), 🌈 rainbow (Lv 30) and 👑 crown (Lv 40) — plus 5 wallpapers and 4 floors. New items show up on the level-reward track and the pet announces them.
- **🛠️ Decorate:** tap *Dekorasi rumah* in the Pet tab to add furniture from the storage, drag it anywhere (higher up = on the wall, lower = in front), flip it, change its size, put it back in storage, change wallpaper and floor, or reset. Up to 24 pieces; arrow keys nudge the selected piece. The room keeps the same proportions on every screen, so your layout looks the same on phone and laptop — and friends see it when they visit.
- **🏠 A bigger house:** the pet house is a wide two-room home (living room + bedroom). On phones it's taller and you swipe sideways to see all of it; on wide screens it fills the card.
- **🚶 Pets live on their own:** pets wander around the house, rest, turn to face where they walk and show little emotes (❤️ 🎵 💤 at night). Tap any pet to pet it.
- **🐾 More than one pet:** adopt up to 8 pets (even several of the same kind). Pet slots grow with your level: 1 at the start, 2 at Lv 3, 3 at Lv 6, 4 at Lv 10, 5 at Lv 15, 6 at Lv 20, 7 at Lv 30 and 8 at Lv 40. Choose one as your ⭐ assistant — it floats with you, gives tips and visits friends — while the others play at home. Rename or release pets any time.
- **Its home shows your day:** the bowl fills with the vegetables and fruit you logged, the water bowl follows your water intake, and its mood changes (senang, bangga, semangat, kangen, haus, tidur). Tap it to pet it.

## How to use

1. Open the [online version](https://sdel0ng.github.io/sehatku/), **or** download `SehatKu.html` (and `SehatKu.ico` if you want a desktop shortcut icon) and open it in Microsoft Edge or Google Chrome.
2. Fill in your profile on first launch (the starting numbers are only examples). After you save it, a 📖 **Panduan singkat** (quick guide) explains the app in a few short steps. Reopen it any time from the Profil tab or the Starter Pack card.
3. Optional: install it as an app with **Profil → 📲 Pasang aplikasi**. On Android that is the APK; on iPhone/iPad and PC see [below](#-install-on-pc-iphone--ipad).
4. Optional: create a free account (💬 Teman tab or Profil) to sync between devices and add friends — see [Accounts, friends, chat & pet visits](#-accounts-friends-chat--pet-visits).

**Windows desktop shortcut (optional):** create a shortcut with target

```
"C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe" --app="file:///C:/path/to/SehatKu.html"
```

and set its icon to `SehatKu.ico` — the app then opens in its own window.

## 📱 Android app

Download **[SehatKu.apk](https://github.com/sdel0ng/sehatku/releases/latest/download/SehatKu.apk)** on your phone, open it and allow *“install from this source”* when Android asks. SehatKu is not on the Play Store; the APK is signed by the SehatKu maintainer (certificate SHA-256 `0F:3C:E8:14:C2:E1:A7:28:1C:03:60:0E:37:5F:8D:6B:EA:93:BA:6C:D1:AA:93:1B:83:62:22:CD:41:37:C4:A7`).

- **Works offline** from the first launch, because the whole app is inside the APK.
- **Updates inside the app:** when a new version is published, **Perbarui** downloads it within the app, with no reinstall. If a new APK is ever needed, the app says so.
- **Backups:** Profil → Export backup opens Android's save dialog, and Import backup opens the file picker.
- **Your data:** without an account the app keeps its own records on that phone (move them with Export/Import backup). Sign in with the same account in the app and on the website to keep both in sync.
- **Sign-in:** email & password — the same account as on the website.

## 💻 Install on PC, iPhone & iPad

SehatKu installs straight from the [online version](https://sdel0ng.github.io/sehatku/) as an app (a *progressive web app*). It is free and needs no app store. The installed app gets its own icon and window, opens without internet and updates itself like the website. Every copy has the 📲 **Pasang aplikasi** card in Profil with three buttons — 🤖 Android, 🍎 iPhone / iPad, 💻 PC / Laptop. The button for the device you are on is highlighted. On another device, the button shows a QR code and the link to open there.

- **💻 PC / laptop (Windows, Mac, Linux, Chromebook):** in Microsoft Edge or Google Chrome, click **💻 PC / Laptop** → **Instal**. SehatKu then appears in the Start menu or Launchpad and can be pinned to the taskbar. You can also use the install icon at the right of the address bar, or Edge's menu **⋯ → Aplikasi → Instal SehatKu**. On a Mac with Safari, use **File → Tambahkan ke Dock**. Firefox can't install web apps. In Edge and Chrome the installed app shares its records with the website in that browser.
- **🍎 iPhone / iPad:** open the online version in **Safari**, tap **Bagikan** (the square with an arrow), then **Tambah ke Layar Utama** → **Tambah**. On iOS 16.4 or later this also works from Chrome or Edge. iOS keeps a home-screen app's storage separate from Safari, so sign in to your account (or use Export/Import backup) to bring your records along. SehatKu is not in the App Store.
- **On the Beranda tab** the online version shows a small *Pasang SehatKu* banner on phones, and on PCs whose browser can install apps. Tap × to hide it on that device.
- **Downloaded `SehatKu.html` files** can't be installed (browsers only install from a website). The 💻 button there opens the online version instead. A downloaded file still works offline in any browser as before.

## 🌐 Accounts, friends, chat & pet visits

The online features are live since v2.0; since v2.1 they have their own 💬 **Teman** tab. They are optional: without an account everything else keeps working offline.

**Getting started:** open the 💬 **Teman** tab (or **Profil → Akun & sinkronisasi**), tap **✉️ Masuk / daftar dengan email**, choose **Daftar baru**, enter your email and a password (at least 6 characters), then pick a username. Sign in with the same email and password on your other devices. Forgot the password? **Lupa password?** sends a reset email.

- **Account & sync:** your records (food, exercise, weight, XP, pets, furniture …) sync to your account automatically after every change and whenever the app opens. The first time you sign in on a device that already has records while your account has records too, SehatKu asks what to do: 🔀 **Gabungkan** (merge both, recommended), ☁️ **Pakai data akun** or 📱 **Pakai data perangkat ini**. Closing that dialog cancels the sign-in and leaves the device untouched.
- **Signing out & deleting:** when signing out you can keep a copy on the device or wipe it (for shared devices). **Hapus akun & catatan di cloud** in Profil deletes the account together with its cloud records, username, friendships and chats; the records on the device stay.
- **🌏 Ruang publik:** a list of everyone on SehatKu who chose to be listed, most recently active first (20 at a time, **Muat lagi** for more). Tap **➕ Tambah** to send a friend request straight away, or tap a person to peek at their house. You appear there by default; switch it off under **✏️ Ubah** on the Teman tab — friends can still find you by username.
- **Username & search:** pick a unique username (3–20 characters: a–z, 0–9, `.` or `_`); the search box in Ruang publik finds people by part of their username.
- **Friends:** send, accept, decline or cancel requests; remove friends; block users (a blocked user can't send you requests).
- **Chat:** the **💬 Chat** list on the Teman tab shows requests, guests and friends with the latest message. Chats open full screen on phones and next to the list on wide screens; the phone/browser **Back** button closes a chat. Emoji stickers, unread markers, read receipts and live delivery while the app is open.
- **New-message alerts:** while SehatKu is open, a new message pops up (via your floating pet or a toast) with a **Balas** button that opens the chat; the Teman tab shows a count and the window title starts with the number of unread chats, e.g. *(2) SehatKu*.
- **Pet visits:** send your pet to a friend's home with a note and a small gift (🍎 🥕 🍌 …). It appears in their pet's home; they can read the note and **send it home** with a reply and a gift back. A pet can be in one home at a time and walks home by itself after 12 hours. Visits also show up in the chat.
- **Friend houses:** tap 🏠 next to a friend (or anyone in Ruang publik) to look around their house — their furniture and all their pets walking around.
- **Privacy:** other signed-in users can only see your username, display name, level, streak, number of badges, your pets, how their house is decorated and when you were last active. Food logs, weight and other health data stay private to your account. Everything is protected by [`firestore.rules`](firestore.rules).
- **Limits:** no push notifications yet — alerts only appear while SehatKu is open (they need a small server, which the free Firebase plan doesn't include). Sign-in is by email only for now; Google sign-in may be added later.

### Firebase backend (maintainers)

The online features use the Firebase project **`sehatku-sdel0ng`** on the free Spark plan: Authentication (Email/Password) and Cloud Firestore (region `asia-southeast2`, Jakarta). The web config in `const CLOUD_CONFIG` in `SehatKu.html` is public by design; access is controlled by [`firestore.rules`](firestore.rules).

- **Rules & indexes:** after editing [`firestore.rules`](firestore.rules) or [`firestore.indexes.json`](firestore.indexes.json), deploy both with the Firebase CLI: `firebase deploy --only firestore` (from a folder whose `firebase.json` points at the two files). Ruang publik needs the composite index on `profiles` (`listed` ↑, `lastSeen` ↓); deploy rules and indexes **before** publishing an app version that relies on them.
- **Google sign-in (optional):** enable the Google provider under Authentication → Sign-in method, set `const CLOUD_GOOGLE = true;` in `SehatKu.html` and publish a new version. Google sign-in only works on the website (authorized domain `sdel0ng.github.io`); the Android app and downloaded copies keep using email.
- **Own backend / offline build:** for a fork, create a Firebase project, enable Email/Password, create a Cloud Firestore database in production mode, publish `firestore.rules`, register a Web app and paste its config into `CLOUD_CONFIG`. With `const CLOUD_CONFIG = null;` the app is fully offline and the account features are hidden.

## Updates

- **Online version:** SehatKu checks for a new version when it opens (and every few hours while it stays open). When one is published, a banner appears: tap **🔄 Perbarui** to load it. You can also check manually in **Profil → Versi aplikasi**. Updates never touch your data.
- **Downloaded file:** the app still tells you when a new version is out. Choose **Unduh file terbaru** and replace your old `SehatKu.html` (your data lives in the browser, not in the file), or switch to the online version.
- **Installed app (PC, iPhone/iPad):** works like the online version — **🔄 Perbarui** loads the new version. A small service worker (`sw.js`) always asks the website first and only uses its saved copy of the app when you are offline, so updates are never held back.

### Publishing a new version (maintainers)

1. Bump `APP_VERSION` in `SehatKu.html`.
2. Put the same version, the date and 1–3 short notes (in Indonesian, shown to users) in `version.json`.
3. Commit both files together to `main`. GitHub Pages publishes them within about a minute, and every open copy of the app (including the Android app) picks up the new version on its next check.
4. Only when the Android shell itself changes: bump `versionCode` in `android/app.json`, run `python android/build_apk.py`, upload `android/build/SehatKu.apk` to a new GitHub Release and set `"apk"` in `version.json` to the new `versionCode`. The build needs JDK 17, Android build-tools 34, platform 34 and the **private signing key**. The key is never in this repository, and every APK must use the same key or phones refuse the update.
5. The installable web app uses `manifest.webmanifest`, `sw.js` and the icons `icon-192.png`, `icon-512.png`, `icon-maskable-512.png` and `apple-touch-icon.png` next to `SehatKu.html`. They don't need changes for a normal release; `sw.js` is network-first, so a new `SehatKu.html` reaches installed apps on its own.

## Data & privacy

Without an account, all data — including XP, badges, pets and settings — is stored only in the browser's `localStorage` and nothing is sent anywhere. It belongs to that browser profile only, and clearing browser data deletes it, so use **Export backup** (Profil tab) regularly or sign in. Backups include game progress. Older v1.0 backups can still be restored; levels and badges are recalculated from the logs.

With an account, your records are also stored in Cloud Firestore (Google Firebase, Jakarta region) under your account, where only you can read or change them. Your email is used for sign-in and password resets only. Your public profile (username, display name, level, streak, badge count, pets, house decoration and last-active time) is visible to other signed-in users so friends can find you, and is listed in Ruang publik unless you switch that off; friend requests, chats and pet visits are visible only to the two people involved.

Without an account, the online version and a downloaded copy keep **separate** data (each browser/site has its own storage). To move your history, sign in to the same account in both, or use **Export backup** in one and **Import backup** in the other.

To look for updates, the app downloads the small public `version.json` from GitHub Pages; nothing about you or your data is sent.

The online version and installed apps keep a copy of the app files (not your data) in the browser's cache, so they can open offline.

## How targets are calculated

- BMR (Mifflin-St Jeor): 10 × weight (kg) + 6.25 × height (cm) − 5 × age + 5 (men) or − 161 (women)
- TDEE = BMR × activity factor (1.2–1.9)
- Daily target = TDEE − chosen deficit (250–1,000 kcal), never below 1,500 kcal (men) / 1,200 kcal (women)
- Protein 1.6 g/kg (goal weight when losing), fat ≈ 27 % of energy, carbohydrate = remainder
- Water ≈ 30 ml/kg body weight

## Changelog

- **2.3** — 📲 **Install SehatKu anywhere:** a new **Pasang aplikasi** card in Profil has buttons for 🤖 Android (APK), 🍎 iPhone / iPad (Add to Home Screen, with step-by-step help) and 💻 PC / laptop (one-click install in Edge/Chrome on Windows, Mac, Linux and Chromebook). Installed apps get their own icon and window and open offline. On another device, each button shows a QR code to scan. The online version shows a small dismissible install banner on Beranda, and the quick guide gets an install step. The Android-only card is replaced.
- **2.2** — 🍜 **220 new foods and drinks** (332 in total) in six new categories: street food (*kaki lima*), cafés & coffee, restaurants, desserts, food courts & fast food and Chinese food; the category chips scroll sideways on phones. A few existing items moved into the new categories (e.g. kopi susu gula aren → Kafe & kopi, martabak manis → Jajanan kaki lima). 🎒 **Starter Pack** for new players: 11 first-step missions with extra XP plus a 300 XP bonus, about Level 5 on day one. 📖 **Panduan singkat**: a six-step quick guide that opens after the first profile save and from Profil any time. Existing records are unchanged.
- **2.1** — 💬 New **Teman** tab: friends, requests and chats on one page (no longer in the Pet tab); chats open full screen on phones and side by side on wide screens, and the Back button closes them. 🌏 **Ruang publik** lists everyone on SehatKu, newest activity first, with one-tap **➕ Tambah** and a peek at their house; you can hide yourself from it. New messages pop up with a **Balas** button, and the unread count shows on the Teman tab and in the window title. Fixed: friends' houses now show their real furniture and all their pets.
- **2.0** — 🌐 **SehatKu is online.** Free accounts with email & password: records sync between phone, laptop and the Android app (merge on first sign-in, nothing gets lost). Usernames, friend search and requests, 💬 chat with stickers, 🐾 pet visits with notes and gifts, and 🏠 friends' houses with their furniture and pets. Health data stays private; friends only see your public pet profile. Without an account everything keeps working offline as before.
- **1.9** — 🏠 Bigger two-room pet house (swipe on phones, full width on laptops). 🚶 Pets walk around by themselves with emotes. 🐾 Adopt up to 8 pets — slots unlock with level — and pick one ⭐ assistant. The floating pet also takes short strolls. Friends will see all your pets walking in your house once accounts are on.
- **1.8** — 🛋️ Furniture rewards: 36 furniture pieces, 5 wallpapers and 4 floors unlock as you level up (something new on every level up to 30). New decorate mode: add, drag, flip, resize, store and reset; the pet's house keeps its proportions on every screen and is shared with friends when accounts are on.
- **1.7** — 🫧 The pet now floats over the app and follows you between tabs: perches on the active tab, looks at your finger/mouse, announces what you log, cheers on level-ups and brings friend news. Tap for tips, drag to move it, or turn floating off in the Pet tab.
- **1.6** — 🐾 **Pet asisten**: adopt a pet that grows with your level (15 pets, 4 growth stages), lives on the dashboard as an assistant with actionable tips, and has its own home. Prepared (switched on when accounts launch): usernames, friend search, friend requests, chat, sending your pet to visit friends with a note and gift, blocking. New 🐾 Pet tab.
- **1.5** — Android app (APK) published on GitHub Releases: works offline, saves backups through Android's save dialog and updates itself inside the app. The website's Profil tab shows an “📱 Aplikasi Android” download card.
- **1.4** — Level rewards: a treasure chest every level-up, the 36-sticker Album Stiker Nusantara (with duplicate stars), outfits for Bro Koli, six colour themes and big rewards at Level 10, 20, 30 and every 10 levels after. New arcade game **Tangkap Sayur**. Players already above Level 1 get their earlier chests straight away.
- **1.3** — Update checker: a banner tells you when a new version is published, **Perbarui** loads it in one tap on the online version, and downloaded copies can fetch the newest file. Manual check in Profil → Versi aplikasi; a short "diperbarui ke versi …" message confirms each update.
- **1.2.1** — Public release on GitHub Pages. New users start with neutral example values (165 cm, 65 kg) instead of personal ones; existing saved data is unchanged.
- **1.2** — New **Seru** tab: weekly boss battle, Tebak Kalori quiz, Peta Nusantara journey map, joke corner and Statistik Kocak. Tap Bro Koli for a joke, boss HP on the dashboard, food emoji in the food log and 5 new badges (30 total). Existing data is kept; bosses already beaten in earlier weeks and your current city are filled in quietly from your logs, and a one-time popup introduces the new tab.
- **1.1.1** — Added Nasi katsu ayam, Chicken katsu and Milo (sachet, UHT box, es Milo). Milo values follow the official Indonesian MILO labels; katsu and es Milo are estimates. Katsu now counts as fried food and Milo as a sweet drink for missions and badges.
- **1.1** — Gamification: mascot Bro Koli, XP & levels, streaks, daily missions, 25 badges, celebrations, the Prestasi tab and fun facts. Existing data is kept. On the first launch after updating, badges already earned from earlier logs unlock quietly, without a flood of popups, and a one-time intro explains the new features.
- **1.0** — First release.

## Disclaimer

Food nutrition values and exercise calories are estimates. SehatKu is a self-monitoring aid, not medical advice — consult a doctor or dietitian if you have a medical condition.
