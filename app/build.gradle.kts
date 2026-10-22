plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.luntik.calendarai"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.luntik.calendarai"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "1.1"
    }
    signingConfigs {
        create("fixed") {
            storeFile = file("calendarai.keystore")
            storePassword = "calendarai123"
            keyAlias = "calendarai"
            keyPassword = "calendarai123"
        }
    }
    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("fixed")
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("fixed")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.12.0")
}
