
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.kotlin.plugin.compose")
}

val libs: Map<String, String> by extra

android {
    namespace = "com.github.leleact.android.example.myapplication"

    defaultConfig {
        applicationId = "com.github.leleact.android.example.myapplication"
        minSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs["lifecycleRuntimeKtx"]!!)
    implementation(libs["activityCompose"]!!)
    implementation(platform(libs["composeBom"]!!))
    implementation(libs["composeUi"]!!)
    implementation(libs["composeUiGraphics"]!!)
    implementation(libs["composeUiToolingPreview"]!!)
    implementation(libs["composeMaterial3"]!!)
    androidTestImplementation(platform(libs["composeBom"]!!))
    androidTestImplementation(libs["composeUiTestJunit4"]!!)
    debugImplementation(libs["composeUiTooling"]!!)
    debugImplementation(libs["composeUiTestManifest"]!!)
}
