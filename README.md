# Code Typer — Android

Native Java Android implementation of Code Typer, a gamified code-typing trainer. The Android app uses Material Design 3, Gson lesson data, RecyclerView, and SharedPreferences persistence.

## Features
- 30 Python typing lessons in 6 categories
- Simulated execution only — no Python interpreter
- Exact normalized code matching
- Common syntax mistake feedback
- XP, progression, hearts, WPM and accuracy
- Local progress with SharedPreferences
- Dark neon UI

## Build
Open `android/` in Android Studio and sync Gradle. Use Android SDK 35, then Run or Build APK.

## Structure
`android/` is an independent Android Studio project. Shared lesson specifications live under `shared/lessons/`; Android copies the six JSON category files into `android/app/src/main/assets/lessons/` for offline packaging.
