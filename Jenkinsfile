pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build APK') {
            steps {
                // If your gradlew is in a subfolder like 'MyApplication123', put that folder name in dir()
                dir('.') {
                    sh 'chmod +x ./gradlew'
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Archive APK') {
            steps {
                // Adjust APK path according to your project structure
                archiveArtifacts artifacts: '**/app/build/outputs/apk/debug/*.apk', fingerprint: true
            }
        }
    }

    post {
        failure {
            echo 'Build failed! Please check the logs.'
        }
    }
}
