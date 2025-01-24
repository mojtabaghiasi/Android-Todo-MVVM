# Android-Todo-MVVM

This is an simple To Do Android Application.
This project is Best practice of using MVVM Architecture


## Installation
Clone this repository and import into **Android Studio**
```bash
git clone git@github.com:mojtabaghiasi/Android-Todo-MVVM.git
```

## Dependencies
* [MVVM](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [Room](https://developer.android.com/training/data-storage/room)
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
* [Data Store](https://developer.android.com/topic/libraries/architecture/datastore)



## Configuration
### Keystores:
Create `app/keystore.gradle` with the your info:
```gradle
ext.key_alias='...'
ext.key_password='...'
ext.store_password='...'
```
And place both keystores under `app/keystores/` directory:
- `playstore.keystore`
- `stage.keystore`


## Build variants
Use the Android Studio *Build Variants* button to choose between **production** and **staging** flavors combined with debug and release build types


## Generating signed APK
From Android Studio:
1. ***Build*** menu
2. ***Generate Signed APK...***
3. Fill in the keystore information *(you only need to do this once manually and then let Android Studio remember it)*

## Maintainers
This project is mantained by:
* [Mojtaba Ghiasi](https://github.com/mojtabaghiasi)


## Contributing

1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -m 'Add some feature')
4. Run the linter (ruby lint.rb').
5. Push your branch (git push origin my-new-feature)
6. Create a new Pull Request
