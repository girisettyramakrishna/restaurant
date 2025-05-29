pipeline {
    agent any

    environment {
        ANDROID_HOME = '/home/jenkins/android-sdk'
        PATH = "${ANDROID_HOME}/platform-tools:${ANDROID_HOME}/cmdline-tools/latest/bin:${PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/girisettyramakrishna/android.git'
            }
        }

        stage('Build APK') {
            steps {
                dir('YourAppDirectory') {
                    sh 'chmod +x ./gradlew'
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: '**/build/outputs/**/*.apk', fingerprint: true
            }
        }
    }

    post {
        failure {
            echo 'Build failed! Please check the logs.'
        }
    }
}
