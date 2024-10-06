plugins {
    id("java")
}

group = "com.arekalov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("com.google.code.gson:gson:2.11.0")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}