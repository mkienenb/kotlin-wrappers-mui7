mui-7 is not fully standalone today, but the remaining coupling is small and entirely in Gradle wiring. The current blockers are:

- kotlin-wrappers/mui-7/settings.gradle.kts:23 includes the monorepo ../build-logic.
- kotlin-wrappers/mui-7/build.gradle.kts:2 and kotlin-wrappers/mui-7/proof/build.gradle.kts:2 both rely on wrappersbuild.kotlin-conventions.
- That included build is itself tied back to the monorepo root catalog in kotlin-wrappers/build-logic/settings.gradle.kts:13.
- The conventions mui-7 actually uses are a fairly small subset of kotlin-wrappers/build-logic/wrappersbuild/src/main/kotlin/wrappersbuild.kotlin-conventions.gradle.kts:47.

I verified this with a temp extraction at /tmp/mui-7-standalone-poc, using kotlin-wrappers-kotlin-js-proof/settings.gradle.kts:3 and kotlin-wrappers-kotlin-js-proof/build.gradle.kts:1 as the model. The isolated copy
configured, compiled compileKotlinJs and :proof:compileKotlinJs, and published to a local repo under /tmp/mui-7-standalone-poc/build/repo.

So the answer is: yes, and it’s straightforward. The real work is to:

- add a local Gradle wrapper and pluginManagement
- inline the Kotlin MPP config currently supplied by wrappersbuild.kotlin-conventions
- keep seskar
- replace the jsMainApi/webMainApi convenience usage with explicit standalone dependency wiring

If you want, I can turn the actual kotlin-wrappers/mui-7 directory into that standalone shape.

