# Solar System App

Solar System App is an Android application developed in Kotlin that allows you to explore the solar system. With this app, you can navigate between different fragments to learn more about the planets, view the daily astronomical news provided by NASA, and explore a 3D model of space. Below, you will find information about key features and how to use the app.

![547shots_so](https://github.com/ArtielSry/KotlinAndroidApp_NASA-API/assets/113340763/45689256-74da-42c2-abcd-711380f659f8)
![544shots_so](https://github.com/ArtielSry/KotlinAndroidApp_NASA-API/assets/113340763/1b37b9c3-f60f-4b6a-bd36-af1cc924ca7d)

## Key Features
Fragment Navigation: The app utilizes the Android Navigation Component to easily move between the following fragments:
- List of planets -> Planet details.
- Daily astronomical news.
- Live video from NASA.

Details Bottom Sheet: When you click on a planet in the planet details fragment, a Bottom Sheet Dialog will slide up, showing additional information such as scientific data, images, and fun facts about the selected planet.
Daily Astronomical News: In the daily astronomical news fragment, the app uses Retrofit to fetch the most recent astronomical news from NASA's API. You can stay updated with the latest space news.
Live Video from NASA: In this fragment you can watch TV NASA.

## How to Use the App
Installation: Clone this repository or download the source code of the app.

Environment Setup: Make sure you have Android Studio installed and configured with Kotlin and Android development tools.

Running the App: Open the project in Android Studio and run the app on an emulator or physical Android device.

Navigation: Use the bottom navigation bar at the bottom of the app to switch between available fragments.

Explore Planets: In the planet list fragment, tap on a planet to view additional details in the planet details fragment.

Read Astronomical News: In the astronomical news fragment, the latest news from NASA will be loaded automatically.

## Requirements
Android Studio
Internet connection to fetch astronomical news
Android emulator or physical device to run the app


