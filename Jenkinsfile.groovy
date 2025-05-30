pipeline {
    agent any

    stages {
        stage('C01 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'java ./src/C01.java'
                    } else {
                        bat 'java ./src/C01.java'
                    }
                }
            }
        }

        stage('C02 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'java ./src/C02.java'
                    } else {
                        bat 'java ./src/C02.java'
                    }
                }
            }
        }

        stage('C03 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'java ./src/C03.java'
                    } else {
                        bat 'java ./src/C03.java'
                    }
                }
            }
        }
    }
}