pipeline {
    agent any

    stages 
    {
        stage('Git Checkout') {
            steps {
                git 'https://github.com/Ashz65823/PiplelineHW.git'
            }
        }
        stage('Maven clean') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Deploy on tomcat') {
            steps {
               deploy adapters: [tomcat9(credentialsId: 'tomcat-user', path: '',
               url: 'http://localhost:9090')], contextPath: null, 
               onFailure: false, war: '**/*.war' 
            }
        }
    }
}