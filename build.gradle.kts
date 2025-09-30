// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.android.build.api.dsl.ApplicationExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application") version "8.13.0" apply false
    id("org.jetbrains.kotlin.android") version "2.2.20" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.10" apply false
}

allprojects {
    apply(from = "$rootDir/dependencies.gradle.kts")
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}

subprojects {
    apply(plugin = "com.android.application")
    apply(plugin = "kotlin-android")
    apply(plugin = "org.jetbrains.kotlin.plugin.compose")

    configure<ApplicationExtension> {
        defaultConfig {
            vectorDrawables.useSupportLibrary = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = "1.5.14"
        }
        packaging {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }

        compileSdk = 36

        defaultConfig {
            targetSdk = 36
            versionCode = 1
            versionName = "1.0"
            minSdk = 21
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
                )
            }
        }

        buildFeatures {
            viewBinding = true
            compose = true
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_21
        }
    }

    val libs: Map<String, Any> by extra
    dependencies {
        add("implementation", fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
        add("implementation", libs["kotlinStdlib"] as String)
        add("implementation", libs["appcompat"] as String)
        add("implementation", libs["coreKtx"] as String)
        add("implementation", libs["constraintlayout"] as String)
        add("implementation", libs["composeRuntime"] as String)
        add("testImplementation", libs["junit"] as String)
        add("androidTestImplementation", libs["testRunner"] as String)
        add("androidTestImplementation", libs["espressoCore"] as String)
        add("androidTestImplementation", libs["androidxJunit"] as String)
    }
}
