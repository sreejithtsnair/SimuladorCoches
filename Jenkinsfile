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
                bat 'cd standalone'
            }
        }
        stage('Build') {
            steps {
                bat 'dir'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
