pipeline {
    agent any

    environment {
        'PATH+ANDROID' = "/home/jenkins/android-sdk/platform-tools:/home/jenkins/android-sdk/cmdline-tools/latest/bin"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/girisettyramakrishna/restaurant.git'
            }
        }

        stage('Build') {
            steps {
                sh '''
                    echo "PATH is: $PATH"
                    # your build commands here, e.g.
                    # ./gradlew build
                '''
            }
        }
    }
}
