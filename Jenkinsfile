pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    git credentialsId: 'git_credentials', url: 'https://github.com/julllllllie/jenkins.git', branch: 'master'
                }
            }
        }
        
        stage('Build the app') {
            steps {
                script {
                    def mvnHome = tool 'Maven-Installation-Name'
                    // Définir explicitement le chemin du script Maven
                    def mvnCmd = "${mvnHome}\\bin\\mvn"
                    sh "${mvnCmd} clean install"
                }
            }
        }

        stage('Unit Test Execution') {
            steps {
                sh 'mvn test'
            }
        }
    }

    tools {
        maven 'Maven'
    }
}
