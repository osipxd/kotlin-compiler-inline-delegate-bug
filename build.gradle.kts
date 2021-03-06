import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
    kotlin("kapt") version "1.5.20"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":delegate-lib"))

    // Needed to reproduce the bug (condition 3)
    kapt("com.google.dagger:dagger-compiler:2.37")
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
