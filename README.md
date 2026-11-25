# SehatKu 🌿

**SehatKu** is a lightweight, offline calorie & health tracker that runs entirely in the browser — a single HTML file with no install, no account and no server. The interface is in Bahasa Indonesia.

Current version: **1.3** (see the [Changelog](#changelog)).

**▶️ Try it online: https://sdel0ng.github.io/sehatku/** — works on phones too. Your data stays in your own browser; nothing is ever uploaded.

## Features

- **Beranda (dashboard)** — remaining calories for the day, protein/carbs/fat vs. targets, water intake, BMI, steps & sleep and automatic tips. It also shows the mascot **Bro Koli 🥦** (tap him for a joke), today's missions, your level and streak, this week's boss HP and a "Tahukah kamu?" fun fact.
- **Makanan (food log)** — 112 common Indonesian foods and drinks with typical portions and food emoji, search and categories, manual entries saved to "Makanan saya", "same as yesterday", editable portions and undo on delete.
- **Aktivitas (exercise)** — 20 activities; calories from MET × body weight × duration; weekly active minutes vs. the WHO 150-minute guideline.
- **Berat (weight)** — weight & waist log, trend chart, kg/week trend, estimated goal date, BMI per Kemenkes RI, WHO Asia-Pacific or WHO.
- **Statistik** — 7/14/30-day averages, days on target, estimated deficit, macro split and top calorie sources.
- **Prestasi (achievements)** — level & XP, streaks, daily missions, a 12-week calendar heatmap and 30 badges with progress.
- **Seru (fun)** — weekly boss battle, the Tebak Kalori quiz, the Peta Nusantara journey map, Bro Koli's joke corner and "Statistik Kocak" (see below).
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

- **👹 Boss Mingguan** — a new villain every Monday: Raja Gorengan, Ratu Gula, Si Mager, Hantu Begadang, Naga Boba, Tuyul Ngemil, Monster Micin and Genderuwo Porsi Jumbo (550–650 HP). Each healthy habit you log is an attack. Logging food 10, three main meals 15, calories on target 30, protein 20, water 20, exercise 15 (+15 if ≥ 30 min), steps 20, sleep 15, vegetables 10, fruit 10, no fried food 15 and no sugary drinks 15. Each boss has two weaknesses that deal double damage. Beat it before Sunday midnight for +100 XP and a trophy.
- **🧠 Tebak Kalori** — "which has more (or fewer) calories?" with two foods from the database. Pairs get closer as your streak grows. Each correct answer gives +2 XP, up to 20 XP per day.
- **🗺️ Peta Nusantara** — progress toward your goal weight is a trip through 16 cities from Sabang to Merauke, with a celebration at every new city. In maintain mode the trip advances with days logged instead (90 days = Merauke).
- **😂 Pojok Bro Koli** — pantun, riddles (*tebak-tebakan*) and cheesy health pick-up lines; tapping Bro Koli on the dashboard tells one too.
- **📈 Statistik Kocak** — lifetime totals in fun units: water in refill gallons, steps in football pitches, exercise calories in pisang goreng, sleep in movies and kg in 1 kg sugar packs.

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
| Weigh-in (max. once per week) | 15 |
| Each badge unlocked | 50 |

\* The budget includes exercise credit. A day counts once breakfast, lunch and dinner are logged, or once the day is over.

## How to use

1. Open the [online version](https://sdel0ng.github.io/sehatku/), **or** download `SehatKu.html` (and `SehatKu.ico` if you want a desktop shortcut icon) and open it in Microsoft Edge or Google Chrome.
2. Fill in your profile on first launch (the starting numbers are only examples).
3. On a phone, use the browser's *Add to Home screen* to open it like an app.

**Windows desktop shortcut (optional):** create a shortcut with target

```
"C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe" --app="file:///C:/path/to/SehatKu.html"
```

and set its icon to `SehatKu.ico` — the app then opens in its own window.

## Updates

- **Online version:** SehatKu checks for a new version when it opens (and every few hours while it stays open). When one is published, a banner appears: tap **🔄 Perbarui** to load it. You can also check manually in **Profil → Versi aplikasi**. Updates never touch your data.
- **Downloaded file:** the app still tells you when a new version is out. Choose **Unduh file terbaru** and replace your old `SehatKu.html` (your data lives in the browser, not in the file), or switch to the online version.

### Publishing a new version (maintainers)

1. Bump `APP_VERSION` in `SehatKu.html`.
2. Put the same version, the date and 1–3 short notes (in Indonesian, shown to users) in `version.json`.
3. Commit both files together to `main`. GitHub Pages publishes them within about a minute, and every open copy of the app picks up the new version on its next check.

## Data & privacy

All data, including XP, badges and settings, is stored locally in the browser's `localStorage`; nothing is sent anywhere. Data belongs to that browser profile only, and clearing browser data deletes it, so use **Export backup** (Profil tab) regularly. Backups include game progress. Older v1.0 backups can still be restored; levels and badges are recalculated from the logs.

The online version and a downloaded copy keep **separate** data (each browser/site has its own storage). To move your history, use **Export backup** in one and **Import backup** in the other.

To look for updates, the app downloads the small public `version.json` from GitHub Pages; nothing about you or your data is sent.

## How targets are calculated

- BMR (Mifflin-St Jeor): 10 × weight (kg) + 6.25 × height (cm) − 5 × age + 5 (men) or − 161 (women)
- TDEE = BMR × activity factor (1.2–1.9)
- Daily target = TDEE − chosen deficit (250–1,000 kcal), never below 1,500 kcal (men) / 1,200 kcal (women)
- Protein 1.6 g/kg (goal weight when losing), fat ≈ 27 % of energy, carbohydrate = remainder
- Water ≈ 30 ml/kg body weight

## Changelog

- **1.3** — Update checker: a banner tells you when a new version is published, **Perbarui** loads it in one tap on the online version, and downloaded copies can fetch the newest file. Manual check in Profil → Versi aplikasi; a short "diperbarui ke versi …" message confirms each update.
- **1.2.1** — Public release on GitHub Pages. New users start with neutral example values (165 cm, 65 kg) instead of personal ones; existing saved data is unchanged.
- **1.2** — New **Seru** tab: weekly boss battle, Tebak Kalori quiz, Peta Nusantara journey map, joke corner and Statistik Kocak. Tap Bro Koli for a joke, boss HP on the dashboard, food emoji in the food log and 5 new badges (30 total). Existing data is kept; bosses already beaten in earlier weeks and your current city are filled in quietly from your logs, and a one-time popup introduces the new tab.
- **1.1.1** — Added Nasi katsu ayam, Chicken katsu and Milo (sachet, UHT box, es Milo). Milo values follow the official Indonesian MILO labels; katsu and es Milo are estimates. Katsu now counts as fried food and Milo as a sweet drink for missions and badges.
- **1.1** — Gamification: mascot Bro Koli, XP & levels, streaks, daily missions, 25 badges, celebrations, the Prestasi tab and fun facts. Existing data is kept. On the first launch after updating, badges already earned from earlier logs unlock quietly, without a flood of popups, and a one-time intro explains the new features.
- **1.0** — First release.

## Disclaimer

Food nutrition values and exercise calories are estimates. SehatKu is a self-monitoring aid, not medical advice — consult a doctor or dietitian if you have a medical condition.
