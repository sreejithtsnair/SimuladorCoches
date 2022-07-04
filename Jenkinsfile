pipeline {
    agent any
    
    stages {
        stage('clone') {
            steps {
                git branch: 'master',url: 'https://github.com/ricardoahumada/SimuladorCoches'                
            }
        }
        stage('verify') {
            steps {
                bat 'dir'
            }
        }
        stage('Build-test') {
            steps {
                bat 'cd standalone'
                echo 'Clean Testing..'
                bat 'mvn clean test'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn package'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
