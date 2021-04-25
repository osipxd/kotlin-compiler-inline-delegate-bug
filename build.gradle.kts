import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0-RC"
    kotlin("kapt") version "1.5.0-RC"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":delegate-lib"))

    // Needed to reproduce the bug (condition 3)
    kapt("com.google.dagger:dagger-compiler:2.35")
}

allprojects {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            useIR = true // IR is enabled
            jvmTarget = "1.8"
        }
    }

    repositories {
        mavenCentral()
    }
}
