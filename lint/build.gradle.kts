plugins {
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    compileOnly(libs.lint.api)
    compileOnly(libs.lint.checks)

    testImplementation(libs.lint.tests)
    testImplementation(libs.junit)
}

tasks.withType<Jar>().configureEach {
    manifest {
        attributes(
            "Lint-Registry-v2" to "vn.io.litever.lint.LiteverIssueRegistry"
        )
    }
}
