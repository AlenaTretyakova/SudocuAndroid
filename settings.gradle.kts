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

rootProject.name = "SUDOKU"
include(":app")
include(":app:mylibrary")
include(":tests:gdx-tests-lwjgl3")
include(":tests:gdx-tests")
include(":extensions:gdx-bullet")
include(":backends:gdx-backend-robovm-metalangle")
include(":backends")
include(":tests:gdx-tests-android")
include(":tests")
include(":extensions:gdx-freetype")
include(":tests:gdx-tests-gwt")
include(":extensions:gdx-setup")
include(":backends:gdx-backend-lwjgl3")
include(":backends:gdx-backend-robovm")
include(":backends:gdx-backend-headless")
include(":tests:gdx-tests-iosrobovm")
include(":backends:gdx-backends-gwt")
include(":tests:gdx-tests-lwjgl")
include(":extensions:gdx-lwjgl3-angle")
include(":gdx")
include(":extensions:gdx-box2d")
include(":backends:gdx-backend-android")
include(":backends:gdx-backend-lwjgl")
include(":extensions:gdx-tools")
