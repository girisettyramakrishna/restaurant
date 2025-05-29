pipeline {
    agent any

    environment {
        ANDROID_HOME = "/home/jenkins/android-sdk"
        PATH+ANDROID = "/home/jenkins/android-sdk/platform-tools:/home/jenkins/android-sdk/cmdline-tools/latest/bin"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/girisettyramakrishna/restaurant.git'
            }
        }

        stage('Permissions') {
            steps {
                sh 'chmod +x gradlew'
            }
        }

        stage('Build APK') {
            steps {
                dir('YourAppDirectory') {
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: '**/app/build/outputs/apk/debug/app-debug.apk', allowEmptyArchive: true
            }
        }
    }

    post {
        failure {
            echo 'Build failed! Please check the logs.'
        }
    }
}
