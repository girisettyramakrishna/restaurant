pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone your repo
                git url: 'https://github.com/girisettyramakrishna/restaurant.git'
            }
        }

        stage('Build') {
            steps {
                // Temporarily extend PATH with Android SDK tools
                withEnv(["PATH=/home/jenkins/android-sdk/platform-tools:/home/jenkins/android-sdk/cmdline-tools/latest/bin:${env.PATH}"]) {
                    sh '''
                        echo "Current PATH:"
                        echo $PATH
                        
                        # Run your build commands here, for example:
                        # ./gradlew assembleDebug
                    '''
                }
            }
        }
    }

    post {
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed, please check the logs.'
        }
    }
}
