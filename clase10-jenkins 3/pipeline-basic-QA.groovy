pipeline {
    agent any 
    stages {
        stage('Deploy to QA ENV') { 
            steps {
                sh 'echo Deployando imagen'
                sh 'echo docker compose yaml'
                as 'agregando y verificando configuracion de ambiente'
                sh 'echo npm run app'
            }
        }
        stage('traerse imagen dockerizada de QA') { 
            steps {
                sh 'echo QA -test instalado'
            }
        }
        stage('Smoke Test - QA') { 
            steps {
                sh 'echo ejecutando Selenium o Jest o TestNG' 
                sh 'echo El Código pasa las pruebas de humo'
            }
        }
        stage('Regression Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de regresión'
            }
        }
        stage('Integracion Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de integracion'
            }
        }
        stage('Security Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de seguridad'
            }
        }
        stage('performance Test') { 
            steps {
                sh 'levantar el terraform simil PROD'
                sh 'traerse la imagen dockerizada del test de performance' 
                sh 'echo El Código pasa las pruebas de performance'
            }
        }
        stage('Reposrting') { 
            steps {
                sh 'echo envio de reportes'
            }
        }
    }
}

