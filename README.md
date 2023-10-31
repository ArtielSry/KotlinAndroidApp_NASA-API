# Solar System App

Solar System App is an Android application developed in Kotlin that allows you to explore the solar system. With this app, you can navigate between different fragments to learn more about the planets, view the daily astronomical news provided by NASA, and explore a 3D model of space. Below, you will find information about key features and how to use the app.

## Key Features
Fragment Navigation: The app utilizes the Android Navigation Component to easily move between the following fragments:
- List of planets -> Planet details.
- Daily astronomical news.
- 3D space model.

Details Bottom Sheet: When you click on a planet in the planet details fragment, a Bottom Sheet Dialog will slide up, showing additional information such as scientific data, images, and fun facts about the selected planet.
Daily Astronomical News: In the daily astronomical news fragment, the app uses Retrofit to fetch the most recent astronomical news from NASA's API. You can stay updated with the latest space news.
3D Space Model: In the 3D space model fragment, you'll enjoy an interactive 3D representation of space. You can explore and zoom in or out to get a better view of the universe.

## How to Use the App
Installation: Clone this repository or download the source code of the app.

Environment Setup: Make sure you have Android Studio installed and configured with Kotlin and Android development tools.

Running the App: Open the project in Android Studio and run the app on an emulator or physical Android device.

Navigation: Use the bottom navigation bar at the bottom of the app to switch between available fragments.

Explore Planets: In the planet list fragment, tap on a planet to view additional details in the planet details fragment.

Read Astronomical News: In the astronomical news fragment, the latest news from NASA will be loaded automatically.

Explore 3D Space: In the 3D space model fragment, use touch gestures to explore the 3D model.

## Requirements
Android Studio
Internet connection to fetch astronomical news
Android emulator or physical device to run the app


