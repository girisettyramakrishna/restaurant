// Top-level build file
// Where you configure project-wide Gradle settings

plugins {
    id 'com.android.application' version '8.1.2' apply false
    id 'org.jetbrains.kotlin.android' version '1.9.20' apply false
    // Add other plugins as needed
}

// Optional: Configure common properties for all subprojects
subprojects {
    afterEvaluate { project ->
        if (project.hasProperty("android")) {
            android {
                compileSdkVersion 34
                defaultConfig {
                    minSdkVersion 21
                    targetSdkVersion 34
                }
            }
        }
    }
}

// Clean task to remove build directories
tasks.register('clean', Delete) {
    delete rootProject.buildDir
}
