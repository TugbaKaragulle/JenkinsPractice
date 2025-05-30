pipeline {
    agent any

    stages {
        stage('C01 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac ./src/C01.java && java -cp ./src C01'
                    } else {
                        bat 'javac .\\src\\C01.java && java -cp .\\src C01'
                    }
                }
            }
        }

        stage('C02 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac ./src/C02.java && java -cp ./src C02'
                    } else {
                        bat 'javac .\\src\\C02.java && java -cp .\\src C02'
                    }
                }
            }
        }

        stage('C03 Stage') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac ./src/C03.java && java -cp ./src C03'
                    } else {
                        bat 'javac .\\src\\C03.java && java -cp .\\src C03'
                    }
                }
            }
        }
    }
}