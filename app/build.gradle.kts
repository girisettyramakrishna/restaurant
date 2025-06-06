plugins {
    id 'com.android.application'
    id 'kotlin-android' // if you use Kotlin
}

android {
    namespace 'com.example.restaurant'
    compileSdk 34

    defaultConfig {
        applicationId "com.example.restaurant"
        minSdk 24
        targetSdk 34
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    buildFeatures {
        compose true
    }

    composeOptions {
        kotlinCompilerExtensionVersion '1.5.3'
    }

    packagingOptions {
        resources {
            excludes += '/META-INF/{AL2.0,LGPL2.1}'
        }
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.2'
    implementation 'androidx.activity:activity-compose:1.8.2'
    implementation 'androidx.compose.ui:ui:1.5.0'
    implementation 'androidx.compose.ui:ui-tooling-preview:1.5.0'
    implementation 'androidx.compose.material3:material3:1.2.0'
    implementation 'androidx.navigation:navigation-compose:2.7.7'

    debugImplementation 'androidx.compose.ui:ui-tooling:1.5.0'
    debugImplementation 'androidx.compose.ui:ui-test-manifest:1.5.0'

    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
    androidTestImplementation 'androidx.compose.ui:ui-test-junit4:1.5.0'
}
