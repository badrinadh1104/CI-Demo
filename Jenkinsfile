pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/badrinadh1104/CI-Demo.git'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
