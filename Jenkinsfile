pipeline {
    agent any

    environment {
        // Append Android SDK platform-tools and cmdline-tools to PATH
        PATH = "/home/jenkins/android-sdk/platform-tools:/home/jenkins/android-sdk/cmdline-tools/latest/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your repo
                git url: 'https://github.com/girisettyramakrishna/restaurant.git'
            }
        }

        stage('Build') {
            steps {
                // Example shell command to verify PATH
                sh '''
                    echo "Current PATH: $PATH"
                    # Run your build commands here, e.g.
                    # ./gradlew build
                '''
            }
        }
    }

    post {
        failure {
            echo "Build failed. Please check the logs."
        }
        success {
            echo "Build succeeded."
        }
    }
}
