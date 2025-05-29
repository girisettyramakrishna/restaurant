pipeline {
    agent any

    environment {
        ANDROID_HOME = '/home/jenkins/android-sdk'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/girisettyramakrishna/restaurant.git', branch: 'master'
            }
        }

        stage('Permissions') {
            steps {
                sh 'chmod +x ./gradlew'
            }
        }

        stage('Build APK') {
            steps {
                sh './gradlew clean assembleDebug'
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: '**/app/build/outputs/apk/debug/*.apk', fingerprint: true
            }
        }
    }

    post {
        failure {
            echo 'Build failed! Please check the logs.'
        }
        success {
            echo 'Build succeeded!'
        }
    }
}
