/*
 * Copyright 2022 LLC Campus.
 */

import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlinSerialization)
}

group = "me.campusapp.parsers"
version = "0.1.0"

dependencies {
    implementation(libs.parserSdk)
    implementation(libs.jsoup)

    testImplementation(libs.parserTestsSdk)
}

subprojects {
    tasks.withType<AbstractTestTask> {
        testLogging {
            exceptionFormat = TestExceptionFormat.FULL
            events = setOf(
                TestLogEvent.SKIPPED,
                TestLogEvent.PASSED,
                TestLogEvent.FAILED
            )
            showStandardStreams = true
        }
        outputs.upToDateWhen { false }
    }
}
