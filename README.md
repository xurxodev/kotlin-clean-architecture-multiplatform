![](http://xurxodev.com/content/images/2017/04/xurxodev-readme.png) 
# Kotlin Clean Architecture Multiplatform [![Build Status](https://travis-ci.org/xurxodev/kotlin-clean-architecture-multiplatform.svg?branch=master)](https://travis-ci.org/xurxodev/kotlin-clean-architecture-multiplatform/)

This example shows how to create a Android app and iOS app using Kotlin multiplatform and Clean Architecture.

This sample based on the [multiplatform documentation](http://kotlinlang.org/docs/reference/multiplatform.html).
If you have questions about the structure or how it works take a look at the documentation there.


## iOS

To compile the project from Xcode just open `iosApp/iosApp.xcodeproj` and run the application.

Xcode has been configured according to [Multiplatform Project: iOS and Android documentation](https://kotlinlang.org/docs/tutorials/native/mpp-ios-android.html)

To compile a framework from the command line execute:

```
  > ./gradlew :core-multiplatform:packForXCode
```

This example use the code analysis tool [swiftlint](https://github.com/realm/SwiftLint).

To execute code analysis

```shell
swiftlint 
```
Or build app

To execute code format

```shell
swiftlint autocorrect
```

## Android

The application can be built and executed on a device or emulator using Android Studio 3.2 or higher.
One can also compile the application and run tests from the command line:

```
   > ./gradlew :androidApp:build
```

This example use the code analysis tool ktlint.

Please configure Android Studio according to instructions in [ktlint readme](https://github.com/shyiko/ktlint).

To execute code analysis

```shell
./gradlew ktlint 
```

Or build app

To execute code format

```shell
./gradlew ktlintformat
```

## Developed By

* Jorge Sánchez Fernández aka [xurxodev](https://twitter.com/xurxodev)

## License


    Copyright 2019 Jorge Sánchez Fernández

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
