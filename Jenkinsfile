pipeline {
    agent any

    environment {
        ANDROID_HOME = "${HOME}/android-sdk"
        PATH = "${ANDROID_HOME}/cmdline-tools/latest/bin:${ANDROID_HOME}/platform-tools:${PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/girisettyramakrishna/restaurant.git'
            }
        }

        stage('Build APK') {
            steps {
                sh 'chmod +x ./gradlew'         // 🛠️ Add this line
                sh './gradlew assembleDebug'    // Then build
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: '**/app/build/outputs/apk/debug/*.apk', fingerprint: true
            }
        }
    }
}
