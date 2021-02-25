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

    implementation("org.mockito:mockito-core")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.assertj:assertj-guava:latest.release")
    implementation("org.apache.commons:commons-lang3:latest.release")
    implementation("org.apache.commons:commons-math3:latest.release")
    implementation("com.google.guava:guava:latest.release")
    implementation("org.jsoup:jsoup:latest.release")
    implementation("org.dom4j:dom4j:latest.release")


    implementation("org.projectlombok:lombok:1.18.16")
    annotationProcessor("org.projectlombok:lombok:1.18.16")

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
