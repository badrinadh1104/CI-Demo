pipeline {
   

    environment {
        
        MYSQL_URL = "jdbc:mysql://mysql:3307/productdb"
        EUREKA_URL = "http://eureka-server:8761/eureka"
    }

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

        stage('Build App') {
            steps {
                sh 'mvn clean package'
            }
        }

       

        
    }
}
