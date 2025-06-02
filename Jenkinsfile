pipeline {
    agent any

    environment {
        ANDROID_HOME = "/home/ubuntu/android-sdk" // Update to match your system
        PATH = "${ANDROID_HOME}/cmdline-tools/latest/bin:${ANDROID_HOME}/platform-tools:${PATH}"
        GRADLE_USER_HOME = "${env.WORKSPACE}/.gradle"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/girisettyramakrishna/restaurant.git', branch: 'master'
            }
        }

        stage('Prepare SDK') {
            steps {
                sh '''
                    echo "sdk.dir=$ANDROID_HOME" > local.properties
                    chmod +x gradlew
                '''
            }
        }

        stage('Build APK') {
            steps {
                sh './gradlew clean assembleDebug'
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: '**/build/outputs/**/*.apk', allowEmptyArchive: false
            }
        }
    }

    post {
        success {
            echo '✅ APK built successfully!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
