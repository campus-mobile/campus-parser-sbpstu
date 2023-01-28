import java.util.Properties

rootProject.name = "campus-parser-sbpstu"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

val localProperties: Properties? = File("local.properties").takeIf { it.exists() }?.let { file ->
    file.inputStream().use { stream ->
        Properties().apply { load(stream) }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        maven {
            url = uri("https://maven.pkg.github.com/campus-mobile/campus-parser-kotlin-sdk")
            credentials {
                username = localProperties?.get("gpr.user")?.toString() ?: System.getenv("USERNAME")
                password = localProperties?.get("gpr.key")?.toString() ?: System.getenv("TOKEN")
            }
        }
    }
}
