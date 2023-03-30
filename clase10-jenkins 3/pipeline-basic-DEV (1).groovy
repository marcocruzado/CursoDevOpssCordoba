pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh 'echo clonando repo'
                sh 'echo chequear dependencias y vulnerabilidades'
                sh 'echo npm install'
                sh 'echo Resultado: El Código compila'
            }
        }
        stage('Test Unitarios') { 
            steps {
                sh 'echo El Código pasa todas las pruebas unitarias'
            }
        }
        stage('Test Sintaxis') { 
            steps {
                sh 'echo El Código pasa las pruebas de sintaxis o estructura del texto'
            }
        }
        stage('Smoke Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de humo'
            }
        }
        stage('Regression Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de regresión'
            }
        }
        stage('Security Test') { 
            steps {
                sh 'echo El Código pasa las pruebas de seguridad'
            }
        }
        stage('empaquetando') { 
            steps {
                sh 'echo verificacion de packages dependientes'
                sh 'echo empaquetando con nexus'
                sh 'echo agregando al registry'
            }
        }
        stage('Versionado') { 
            steps {
                sh 'echo taggeado de imagen y versionado'
            }
        }
        stage('Deploy to DEV ENV') { 
            steps {
                sh 'echo Deployando component'
            }
        }
    }
}
