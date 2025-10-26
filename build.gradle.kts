plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.22" // Kotlin + JVM
    id("jacoco")
}

jacoco{
    toolVersion = "0.8.12"
}
kotlin{
    jvmToolchain(21)
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")


    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.0")
}

tasks.test {
    useJUnitPlatform()
}
tasks.jacocoTestReport {
    dependsOn(tasks.test) // Зависит от выполнения тестов
    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.required.set(true)
    }
}