plugins {
    java
    id("org.springframework.boot") version "2.2.12.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {

    //https://github.com/Codewars/codewars.com/wiki/Language-Java
    implementation("net.jqwik:jqwik")
    implementation("org.mockito:mockito-core")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.assertj:assertj-guava")
    implementation("org.apache.commons:commons-lang3")
    implementation("org.apache.commons:commons-math3")
    implementation("com.google.guava:guava")
    implementation("org.jsoup:jsoup")
    implementation("org.dom4j:dom4j")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        exclude(group = "junit", module = "junit")
        exclude(module = "junit")
    }
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}


tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
