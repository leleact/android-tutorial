// D:/Dev/SourceCode/Android/android-tutorial/dependencies.gradle.kts
val versions = mapOf(
    "kotlin" to "2.1.21",
    "appcompat" to "1.7.1",
    "coreKtx" to "1.16.0",
    "constraintlayout" to "2.2.1",
    "composeRuntime" to "1.8.3",
    "composeBom" to "2025.06.01",
    "activityCompose" to "1.10.1",
    "lifecycleRuntimeKtx" to "2.9.1",
    "drawerlayout" to "1.2.0",
    "cardview" to "1.0.0",
    "media" to "1.7.0",
    "legacySupport" to "1.0.0",
    "material" to "1.12.0",
    "gson" to "2.13.1",
    "flexbox" to "3.0.0",
    "junit" to "4.13.2",
    "androidxJunit" to "1.2.1",
    "testRunner" to "1.6.2",
    "espressoCore" to "3.6.1"
)

val libs = mapOf(
    "kotlinStdlib" to "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${versions["kotlin"]}",
    "appcompat" to "androidx.appcompat:appcompat:${versions["appcompat"]}",
    "coreKtx" to "androidx.core:core-ktx:${versions["coreKtx"]}",
    "constraintlayout" to "androidx.constraintlayout:constraintlayout:${versions["constraintlayout"]}",
    "drawerlayout" to "androidx.drawerlayout:drawerlayout:${versions["drawerlayout"]}",
    "cardview" to "androidx.cardview:cardview:${versions["cardview"]}",
    "media" to "androidx.media:media:${versions["media"]}",
    "legacySupport" to "androidx.legacy:legacy-support-v4:${versions["legacySupport"]}",
    "material" to "com.google.android.material:material:${versions["material"]}",
    "gson" to "com.google.code.gson:gson:${versions["gson"]}",
    "flexbox" to "com.google.android.flexbox:flexbox:${versions["flexbox"]}",

    // Compose
    "composeBom" to "androidx.compose:compose-bom:${versions["composeBom"]}",
    "composeRuntime" to "androidx.compose.runtime:runtime:${versions["composeRuntime"]}",
    "activityCompose" to "androidx.activity:activity-compose:${versions["activityCompose"]}",
    "lifecycleRuntimeKtx" to "androidx.lifecycle:lifecycle-runtime-ktx:${versions["lifecycleRuntimeKtx"]}",
    "composeUi" to "androidx.compose.ui:ui",
    "composeUiGraphics" to "androidx.compose.ui:ui-graphics",
    "composeUiToolingPreview" to "androidx.compose.ui:ui-tooling-preview",
    "composeMaterial3" to "androidx.compose.material3:material3",
    "composeUiTooling" to "androidx.compose.ui:ui-tooling",
    "composeUiTestManifest" to "androidx.compose.ui:ui-test-manifest",


    // Test
    "junit" to "junit:junit:${versions["junit"]}",
    "androidxJunit" to "androidx.test.ext:junit:${versions["androidxJunit"]}",
    "testRunner" to "androidx.test:runner:${versions["testRunner"]}",
    "espressoCore" to "androidx.test.espresso:espresso-core:${versions["espressoCore"]}",
    "composeUiTestJunit4" to "androidx.compose.ui:ui-test-junit4"
)

extra["versions"] = versions
extra["libs"] = libs
