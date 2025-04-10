A drop-in replacement for `sdkmanager` from the Android SDK written in Python.
It implements the exact API of the
[`sdkmanager`](https://developer.android.com/studio/command-line/sdkmanager)
command line.  It only deviates from that API if it can be done while being 100%
compatible.

The project also attempts to maintain the same terminal output so it can be
compatible with things that scrape `sdkmanager` output.


## Code Format

This project uses Black to automatically format all the Python code.  It uses
the version of Black that is in Debian/stable.  To format the code, run:

```bash
black --skip-string-normalization *.py
```

## Reverse Engineering Functionality

This project includes a reverse engineering functionality that allows you to reverse engineer the SDK packages. To use this functionality, you can use the `--reverse-engineer` command-line argument.

### Usage

To reverse engineer the SDK packages, run the following command:

```bash
sdkmanager --reverse-engineer
```

This will trigger the reverse engineering process and provide you with the necessary information to reverse engineer the SDK packages.

## Android Project

This project now includes an Android project that provides the same functionality as the Python script. The Android project is implemented in Java/Kotlin and utilizes existing Android libraries to handle SDK management tasks.

### Setting Up the Android Project

1. Open Android Studio.
2. Select "Open an existing Android Studio project".
3. Navigate to the `android_project` directory and select it.
4. Wait for the project to sync and build.

### Running the Android Project

1. Connect an Android device or start an emulator.
2. Click the "Run" button in Android Studio.
3. The app will be installed and launched on the connected device or emulator.

### MainActivity

The `MainActivity` class handles the main functionality of the app. It includes methods to handle SDK management tasks such as installing, listing, and updating packages.

### SDK Management Methods

The following methods are implemented in the `MainActivity` class to handle SDK management tasks:

- `installPackage(String packageName)`: Installs the specified SDK package.
- `listPackages()`: Lists all available SDK packages.
- `updatePackage(String packageName)`: Updates the specified SDK package.

### Layout

The layout for the `MainActivity` is defined in the `activity_main.xml` file. It includes UI elements to interact with the SDK management methods.
