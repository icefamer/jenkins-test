pipeline {
    agent { label 'my-defined-label' }
       stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
