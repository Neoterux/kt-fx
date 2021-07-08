plugins {
    java
    kotlin("jvm") version "1.5.20"
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("org.jetbrains.dokka") version "1.5.0"
    maven
}

group = "com.neoterux"
version = "0.0.1-alpha"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

javafx {
    version = "11.0.2"
    modules("javafx.controls", "javafx.fxml", "javafx.swing")
}


dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    dokkaGfmPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.5.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.getByName("install") {
    dependsOn("clean", "dokkaJavadoc", "jar")
}