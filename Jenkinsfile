pipeline {
    agent any

    parameters {
        string(name: 'MULTIPLIER_NUMBER', defaultValue: '5',
               description: 'Integer whose multiplication table will be displayed')
        string(name: 'DEPLOY_DIR', defaultValue: '/tmp/multiplication-app',
               description: 'Local directory where the JAR will be deployed')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test package'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    mkdir -p "$DEPLOY_DIR"
                    cp target/MavenStudentProject-1.0-SNAPSHOT.jar \
                       "$DEPLOY_DIR/MavenStudentProject-1.0-SNAPSHOT.jar"
                '''
            }
        }

        stage('Run') {
            steps {
                sh '''
                    java -jar "$DEPLOY_DIR/MavenStudentProject-1.0-SNAPSHOT.jar" \
                         "$MULTIPLIER_NUMBER"
                '''
            }
        }
    }
}
