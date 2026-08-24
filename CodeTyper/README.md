# Code Typer ⚡

Gamified programming-learning app combining Duolingo-style progression with Rapid-Typing-style code practice.

- Windows: Electron + HTML/CSS/JS
- Android: native Java + Material Design 3
- 30 Python lessons across 6 categories
- Simulated execution only; no Python interpreter
- XP, levels, stars, hearts, streaks, WPM and accuracy
- Local persistence

## Distribution ZIP
The complete generated source is available in the conversation as `CodeTyper-complete.zip`.

## Windows
```bash
cd windows
npm install
npm start
npm run dist
```

## Android
Open `android/` in Android Studio, sync Gradle, and run the app.

## Lesson data
`lessons/01_basics.json` through `lessons/06_advanced.json` contain all 30 lessons.
