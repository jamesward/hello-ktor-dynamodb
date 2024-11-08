plugins {
    kotlin("jvm") version "2.0.21"
    application
    //id("aws.sdk.kotlin.hll.dynamodbmapper.schema.generator") version "1.3.70-beta"
    kotlin("plugin.serialization") version "2.0.21"
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.0.1")
    implementation("io.ktor:ktor-server-cio:3.0.1")
    implementation("io.ktor:ktor-server-content-negotiation:3.0.1")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.0.1")
    implementation("aws.sdk.kotlin:dynamodb-mapper:1.3.70-beta")
    implementation("aws.sdk.kotlin:dynamodb-mapper-annotations:1.3.70-beta")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.16")
    testImplementation("org.testcontainers:localstack:1.20.3")
}

application {
    mainClass = "MainKt"
}

tasks.register<JavaExec>("runTest") {
    group = "application"
    description = "Runs the main class from src/test/kotlin"
    classpath = sourceSets["test"].runtimeClasspath
    mainClass = "DevKt"
    jvmArgs = listOf("-Dio.ktor.development=true")
}
