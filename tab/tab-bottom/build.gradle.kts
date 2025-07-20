import com.android.build.api.dsl.ApplicationExtension

val libs: Map<String, String> by extra

configure<ApplicationExtension> {
    defaultConfig {
        applicationId = "com.github.leleact.android.tab.bottom"
    }
    namespace = "com.github.leleact.android.tab.bottom"
}

dependencies {
    implementation(libs["material"]!!)
}
