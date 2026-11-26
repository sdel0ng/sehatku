# SehatKu 🌿

**SehatKu** is a lightweight, offline calorie & health tracker that runs entirely in the browser — a single HTML file with no install, no account and no server. The interface is in Bahasa Indonesia.

Current version: **1.9** (see the [Changelog](#changelog)).

**▶️ Try it online: https://sdel0ng.github.io/sehatku/** — works on phones too. Your data stays in your own browser; nothing is ever uploaded.

**📱 Android app: [download SehatKu.apk](https://github.com/sdel0ng/sehatku/releases/latest/download/SehatKu.apk)** (Android 7.0+, about 0.2 MB).

## Features

- **Beranda (dashboard)** — remaining calories for the day, protein/carbs/fat vs. targets, water intake, BMI, steps & sleep and automatic tips. It also shows the mascot **Bro Koli 🥦** (tap him for a joke), today's missions, your level and streak, this week's boss HP and a "Tahukah kamu?" fun fact.
- **Makanan (food log)** — 112 common Indonesian foods and drinks with typical portions and food emoji, search and categories, manual entries saved to "Makanan saya", "same as yesterday", editable portions and undo on delete.
- **Aktivitas (exercise)** — 20 activities; calories from MET × body weight × duration; weekly active minutes vs. the WHO 150-minute guideline.
- **Berat (weight)** — weight & waist log, trend chart, kg/week trend, estimated goal date, BMI per Kemenkes RI, WHO Asia-Pacific or WHO.
- **Statistik** — 7/14/30-day averages, days on target, estimated deficit, macro split and top calorie sources.
- **Prestasi (achievements)** — level & XP, 🎁 level rewards (treasure chests, a 36-sticker album, outfits for Bro Koli and colour themes), streaks, daily missions, a 12-week calendar heatmap and 30 badges with progress.
- **Seru (fun)** — the Tangkap Sayur arcade game, weekly boss battle, the Tebak Kalori quiz, the Peta Nusantara journey map, Bro Koli's joke corner and "Statistik Kocak" (see below).
- **Profil** — personal data and targets, JSON backup/restore and CSV export for Excel.

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

\* The budget includes exercise credit. A day counts once breakfast, lunch and dinner are logged, or once the day is over.

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
2. Fill in your profile on first launch (the starting numbers are only examples).
3. On a phone, use the browser's *Add to Home screen* to open it like an app.

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
- **Separate data:** the app keeps its own records on that phone. Move them from the browser version with Export/Import backup.
- **Sign-in:** inside the app, sign-in (when accounts launch) uses email; Google sign-in works on the website.

## 🌐 Friends, chat & pet visits (needs an account)

These features turn on once the maintainer connects a Firebase project (see below); until then the Pet tab works fully offline without them.

- **Username & search:** pick a unique username (3–20 characters: a–z, 0–9, `.` or `_`) and find friends by typing part of theirs.
- **Friends:** send, accept, decline or cancel requests; remove friends; block users (a blocked user can't send you requests).
- **Chat:** one-to-one chat with friends, emoji stickers, unread markers, read receipts and live delivery while the app is open.
- **Pet visits:** send your pet to a friend's home with a note and a small gift (🍎 🥕 🍌 …). It appears in their pet's home; they can read the note and **send it home** with a reply and a gift back. A pet can be in one home at a time and walks home by itself after 12 hours. Visits also show up in the chat.
- **Privacy:** other users can only see your username, display name, level, streak, number of badges, your pet and how its house is decorated. Food logs, weight and other health data stay private to your account. Everything is protected by `firestore.rules`.
- **Limits:** no push notifications yet — new messages and visits appear while the app is open (badge on the 🐾 Pet tab and a pop-up).

### Connecting Firebase (maintainers)

1. Create a Firebase project and enable **Authentication → Email/Password** (and Google for the website). Add `sdel0ng.github.io` under authorized domains.
2. Create a **Cloud Firestore** database (production mode) and publish the rules from [`firestore.rules`](firestore.rules).
3. Register a Web app and paste its config object into `const CLOUD_CONFIG = …` in `SehatKu.html`, then publish a new version.

## Updates

- **Online version:** SehatKu checks for a new version when it opens (and every few hours while it stays open). When one is published, a banner appears: tap **🔄 Perbarui** to load it. You can also check manually in **Profil → Versi aplikasi**. Updates never touch your data.
- **Downloaded file:** the app still tells you when a new version is out. Choose **Unduh file terbaru** and replace your old `SehatKu.html` (your data lives in the browser, not in the file), or switch to the online version.

### Publishing a new version (maintainers)

1. Bump `APP_VERSION` in `SehatKu.html`.
2. Put the same version, the date and 1–3 short notes (in Indonesian, shown to users) in `version.json`.
3. Commit both files together to `main`. GitHub Pages publishes them within about a minute, and every open copy of the app (including the Android app) picks up the new version on its next check.
4. Only when the Android shell itself changes: bump `versionCode` in `android/app.json`, run `python android/build_apk.py`, upload `android/build/SehatKu.apk` to a new GitHub Release and set `"apk"` in `version.json` to the new `versionCode`. The build needs JDK 17, Android build-tools 34, platform 34 and the **private signing key**. The key is never in this repository, and every APK must use the same key or phones refuse the update.

## Data & privacy

All data, including XP, badges, your pet and settings, is stored locally in the browser's `localStorage`; nothing is sent anywhere unless you sign in to an account (when accounts are enabled), which syncs your records privately to your own Firebase account. Data belongs to that browser profile only, and clearing browser data deletes it, so use **Export backup** (Profil tab) regularly. Backups include game progress. Older v1.0 backups can still be restored; levels and badges are recalculated from the logs.

The online version and a downloaded copy keep **separate** data (each browser/site has its own storage). To move your history, use **Export backup** in one and **Import backup** in the other.

To look for updates, the app downloads the small public `version.json` from GitHub Pages; nothing about you or your data is sent.

## How targets are calculated

- BMR (Mifflin-St Jeor): 10 × weight (kg) + 6.25 × height (cm) − 5 × age + 5 (men) or − 161 (women)
- TDEE = BMR × activity factor (1.2–1.9)
- Daily target = TDEE − chosen deficit (250–1,000 kcal), never below 1,500 kcal (men) / 1,200 kcal (women)
- Protein 1.6 g/kg (goal weight when losing), fat ≈ 27 % of energy, carbohydrate = remainder
- Water ≈ 30 ml/kg body weight

## Changelog

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
