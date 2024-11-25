rootProject.name = "campus-parser-spbstu"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/campus-mobile/campus-parser-kotlin-sdk")
            credentials {
                username = "TOKEN"
                password = providers.gradleProperty("github.token").orNull ?: System.getenv("GPR_TOKEN")
            }
        }
    }
}
