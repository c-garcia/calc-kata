plugins {
    java
    id("com.diffplug.spotless") version "5.14.2"
}

group = "com.thoughtworks.calc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation("org.mockito:mockito-core:3.+")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform(){
        excludeTags("e2e")
    }
}

tasks.create<Test>("e2e-test"){
    setProperty("group", "verification")
    dependsOn("test")
    useJUnitPlatform(){
        includeTags("e2e")
    }
}

tasks.getByName<DefaultTask>("check"){
    dependsOn("e2e-test")
}
