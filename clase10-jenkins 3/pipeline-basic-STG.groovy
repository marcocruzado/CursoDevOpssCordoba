pipeline {
    agent any 
    stages {
        stage('Deploy to STG ENV') { 
            steps {
                sh 'echo Deployando imagen'
                sh 'echo docker compose yaml'
                as 'agregando y verificando configuracion de ambiente'
                sh 'echo npm run app'
            }
        }
        stage('Disponer de ambiente para usuario') { 
            steps {
                sh 'echo ambiente instalado'
            }
        }
        parallel {
            stage('Ejecutar logger de aplicacion') { 
                steps {
                    sh 'echo Ok del usuario' 
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
            stage('Reporting') { 
                steps {
                    sh 'echo envio de reportes'
                }
            }
        }
    }
}

