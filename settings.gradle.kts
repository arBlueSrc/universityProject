import org.gradle.internal.impldep.org.bouncycastle.asn1.x500.style.RFC4519Style.name

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        google()
        mavenCentral()
        maven (
            url ="https://maven.google.com/"
        )
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven (
            url ="https://maven.google.com/"
        )
    }
}

rootProject.name = "Q"
include(":app")
