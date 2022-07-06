pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',url: 'https://github.com/sreejithtsnair/SimuladorCoches.git' 
                bat 'dir'
	        }
        }        
        stage('Compile') {
            steps {
                dir ('standalone'){
                    echo 'Building...'
                    bat 'dir'
                    bat 'C:/Programs/apache-maven-3.8.6/bin/mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging...'                
            }
        }
        stage('Acceptance test') {
            steps {
                echo 'Acceptance...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
