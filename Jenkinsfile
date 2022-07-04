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
                echo 'Clean Testing..'
                dir ('standalone'){
                    bat 'dir'
                    bat 'mvn clean test'
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                dir ('standalone'){
                    bat 'mvn package'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
