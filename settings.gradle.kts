pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "study"
include(":app")
include(":features:auth:registration")
include(":features:auth:login")
include(":features:main:home")
include(":features:main:chat")
include(":features:main:calendar")
include(":features:main:profile")
include(":core:ui")
