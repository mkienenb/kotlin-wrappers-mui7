plugins {
    kotlin("multiplatform") version "2.3.21"
    id("io.github.turansky.seskar") version "4.40.0"
    `maven-publish`
}

group = "org.gamenet.kotlin-wrappers.experimental"
version = "7.3.10-pre.3"

val githubPackagesOwner = "mkienenb"
val githubPackagesRepository = "kotlin-wrapper-mui7"

val commonFreeCompilerArgs = listOf(
    "-Xexpect-actual-classes",
    "-Xdont-warn-on-error-suppression",
    "-Xwarning-level=NOTHING_TO_INLINE:disabled",
)

val commonOptIns = listOf(
    "kotlin.ExperimentalStdlibApi",
    "kotlin.ExperimentalUnsignedTypes",
    "kotlin.ExperimentalMultiplatform",
    "kotlin.contracts.ExperimentalContracts",
    "kotlin.js.ExperimentalJsExport",
    "js.internal.InternalApi",
    "kotlin.js.ExperimentalWasmJsInterop",
)

val jsFreeCompilerArgs = listOf(
    "-Xes-long-as-bigint",
    "-Xir-generate-inline-anonymous-functions",
)

kotlin {
    applyDefaultHierarchyTemplate()

    compilerOptions {
        allWarningsAsErrors = true
        freeCompilerArgs.addAll(commonFreeCompilerArgs)
        optIn.addAll(commonOptIns)
    }

    js {
        outputModuleName = project.name

        browser()

        compilerOptions {
            target = "es2015"
            freeCompilerArgs.addAll(jsFreeCompilerArgs)
        }
    }
}

dependencies {
    add("jsMainApi", kotlinWrappers.js)
    add("jsMainApi", kotlinWrappers.react)
    add("jsMainApi", kotlinWrappers.reactDom)
    add("jsMainApi", kotlinWrappers.csstype)

    add("webMainApi", npm("@emotion/react", "^11.14.0"))
    add("webMainApi", npm("@emotion/styled", "^11.14.1"))
    add("webMainApi", npm("@mui/icons-material", "7.3.10"))
    add("webMainApi", npm("@mui/material", "7.3.10"))
    add("webMainApi", npm("@mui/system", "7.3.10"))
    add("webMainApi", npm("react", "^19.2.5"))
    add("webMainApi", npm("react-dom", "^19.2.5"))
}

publishing {
    repositories {
        maven {
            name = "localBuildRepo"
            url = layout.buildDirectory.dir("repo").get().asFile.toURI()
        }
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/$githubPackagesOwner/$githubPackagesRepository")
            credentials(PasswordCredentials::class) {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("PUBLISH_TOKEN") ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
