import com.android.build.api.dsl.ApplicationExtension

val libs: Map<String, String> by extra

configure<ApplicationExtension> {
    defaultConfig {
        multiDexEnabled = true
        applicationId = "com.github.leleact.android.menu.navigation"
    }
    namespace = "com.github.leleact.android.menu.navigation"
}

dependencies {
    //androidX
    implementation(libs["cardview"]!!)
    implementation(libs["media"]!!)
    implementation(libs["legacySupport"]!!)

    //google
    implementation(libs["material"]!!)
    implementation(libs["gson"]!!)
    implementation(libs["flexbox"]!!)
}
