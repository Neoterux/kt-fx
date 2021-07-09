import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.5.20"
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("org.jetbrains.dokka") version "1.5.0"
    `maven-publish`
}

group = "com.neoterux"
version = "0.0.1-alpha"

repositories {
    jcenter()
    mavenCentral()
    maven(url = "https://jitpack.io")
}

javafx {
    version = "11.0.2"
    modules("javafx.controls", "javafx.fxml", "javafx.swing")
}

java {
    withSourcesJar()
    withJavadocJar()
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    dokkaGfmPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.5.0")
}

tasks.withType<JavaCompile> {
    sourceCompatibility += JavaVersion.VERSION_11
    targetCompatibility += JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.neoterux"
            artifactId = "javafx-ktx"
            version = "0.0.1-alpha"
            pom {
                name.set("Javafx-Ktx")
                description.set("A set of kotlin extensions for JavaFx")

                developers {
                    developer{
                        id.set("Neoterux")
                        name.set("Luis Bajaña")
                        email.set("neoterux@gmail.com")
                    }
                }
            }

            from(components["java"])
        }
    }
}

//tasks.getByName("stage") {
//    dependsOn("clean", "dokkaJavadoc","dokkaJavadocJar","sourcesJar", "jar")
//}

tasks.getByName("publishToMavenLocal") {
    dependsOn("dokkaJavadoc", "dokkaJavadocJar")
}

//tasks.create("install") {
//    dependsOn("clean", "dokkaJavadoc", "dokkaJavadocJar", "sourcesJar", "jar", "publishToMavenLocal")
//}

tasks.getByName("build") {
    dependsOn("dokkaJavadoc", "dokkaJavadocJar")
}

tasks.create("dokkaJavadocJar", Jar::class){
    from(buildDir.resolve("dokka").path)
    classifier = "javadoc"
}
