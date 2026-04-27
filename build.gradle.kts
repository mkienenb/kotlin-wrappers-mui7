plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dokka)
    alias(libs.plugins.nmcp)
    alias(libs.plugins.seskar)
    `maven-publish`
    signing
}

group = "io.github.mkienenb.kotlin-wrappers.experimental"
version = "7.3.10-pre.4"

val projectRepositoryUrl = "https://github.com/mkienenb/kotlin-wrapper-mui7"

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

    add("webMainApi", npm("@emotion/react", libs.versions.emotion.react.get()))
    add("webMainApi", npm("@emotion/styled", libs.versions.emotion.styled.get()))
    add("webMainApi", npm("@mui/icons-material", libs.versions.mui.get()))
    add("webMainApi", npm("@mui/material", libs.versions.mui.get()))
    add("webMainApi", npm("@mui/system", libs.versions.mui.get()))
    add("webMainApi", npm("react", libs.versions.react.get()))
    add("webMainApi", npm("react-dom", libs.versions.reactdom.get()))
}

val javadocJar by tasks.registering(Jar::class) {
    dependsOn(tasks.named("dokkaGeneratePublicationHtml"))
    archiveClassifier = "javadoc"
    from(layout.buildDirectory.dir("dokka/html"))
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        artifact(javadocJar)
        pom {
            name = "Kotlin Wrapper for MUI 7"
            description = "Experimental Kotlin/JS wrappers for Material UI 7."
            url = projectRepositoryUrl

            licenses {
                license {
                    name = "The Apache License, Version 2.0"
                    url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                }
            }

            developers {
                developer {
                    id = "mkienenb"
                    name = "Mike Kienenberger"
                    email = "mkienenb@gmail.com"
                    organization = "mkienenb"
                    organizationUrl = "https://github.com/mkienenb"
                }
            }

            scm {
                connection = "scm:git:$projectRepositoryUrl.git"
                developerConnection = "scm:git:$projectRepositoryUrl.git"
                url = projectRepositoryUrl
            }
        }
    }

    repositories {
        maven {
            name = "localBuildRepo"
            url = layout.buildDirectory.dir("repo").get().asFile.toURI()
        }
        maven {
            name = "CentralPortalSnapshots"
            url = uri("https://central.sonatype.com/repository/maven-snapshots/")
            credentials(PasswordCredentials::class) {
                username = System.getenv("MAVEN_CENTRAL_USERNAME")
                password = System.getenv("MAVEN_CENTRAL_PASSWORD")
            }
            mavenContent {
                snapshotsOnly()
            }
        }
    }
}

nmcp {
    publishAllPublicationsToCentralPortal {
        username.set(providers.environmentVariable("MAVEN_CENTRAL_USERNAME"))
        password.set(providers.environmentVariable("MAVEN_CENTRAL_PASSWORD"))
        publishingType.set("USER_MANAGED")
        publicationName.set(rootProject.name)
    }
}

tasks.withType<AbstractPublishToMaven>().configureEach {
    mustRunAfter(tasks.withType<Sign>())
}

signing {
    val signingKey = System.getenv("MAVEN_CENTRAL_SIGNING_KEY")
    val signingPassword = System.getenv("MAVEN_CENTRAL_SIGNING_PASSWORD")

    setRequired {
        gradle.taskGraph.allTasks.any {
            it.name.contains("CentralPortal", ignoreCase = true) ||
                it.name.contains("CentralSnapshots", ignoreCase = true)
        }
    }

    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications)
}
