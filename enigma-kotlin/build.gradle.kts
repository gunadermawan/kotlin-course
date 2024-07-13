plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
//    coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(13)
}