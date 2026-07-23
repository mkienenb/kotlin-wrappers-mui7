plugins {
    kotlin("multiplatform") version "2.4.10"
}

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
    add("jsMainImplementation", project(":"))
    add("jsMainImplementation", kotlinWrappers.js)
    add("jsMainImplementation", kotlinWrappers.react)
    add("jsMainImplementation", kotlinWrappers.reactDom)
    add("jsMainImplementation", kotlinWrappers.csstype)

    add("webMainImplementation", npm("@emotion/react", "^11.14.0"))
    add("webMainImplementation", npm("@emotion/styled", "^11.14.1"))
    add("webMainImplementation", npm("react", "^19.2.5"))
    add("webMainImplementation", npm("react-dom", "^19.2.5"))
}
