pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    val comGradleupNmcpSettingsVersion = extra["com-gradleup-nmcp-settings.version"] as String
    id("com.gradleup.nmcp.settings") version comGradleupNmcpSettingsVersion
}

rootProject.name = "kotlin-wrapper-mui7"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("kotlinWrappers") {
            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

include("proof")

nmcpSettings {
    centralPortal {
        username = providers.environmentVariable("MAVEN_CENTRAL_USERNAME")
            .orElse("mkienenb")
            .get()
        password = providers.environmentVariable("MAVEN_CENTRAL_PASSWORD")
            .orElse("")
            .get()
        publishingType = "USER_MANAGED"
        publicationName = rootProject.name
    }
}
