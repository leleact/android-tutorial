import com.android.build.api.dsl.ApplicationExtension

val libs: Map<String, String> by extra

configure<ApplicationExtension> {
    defaultConfig {
        applicationId = "com.github.leleact.drawerlayout"
    }
    namespace = "com.github.leleact.drawerlayout"
}

dependencies {
    implementation(libs["drawerlayout"]!!)
}
