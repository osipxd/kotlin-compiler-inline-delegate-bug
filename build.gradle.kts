import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("kapt") version "1.8.10"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":delegate-lib"))

    // Needed to reproduce the bug (condition 3)
    kapt("com.google.dagger:dagger-compiler:2.45")
}

allprojects {
    repositories {
        mavenCentral()
    }
}
