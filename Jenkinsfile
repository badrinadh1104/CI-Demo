pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "your-dockerhub-username/product-service"
        MYSQL_URL = "jdbc:mysql://mysql:3306/productdb"
        EUREKA_URL = "http://eureka-server:8761/eureka"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/badrinadh1104/CI-Demo.git'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}