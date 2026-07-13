pipeline {
    agent any
    parameters {
        string(name: 'RADIUS', defaultValue: '1', description: 'this is to cal area')
    }
    stages {
        stage('Test') {
            steps {
                echo "This is test step"
            }
        }
        stage('Calculate') {
            steps {
                sh "javac ${env.WORKSPACE}/scripts/CalPai.java"
                sh "java -cp ${env.WORKSPACE}/scripts CalPai ${params.RADIUS}"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy to production"
            }
        }
    }
}