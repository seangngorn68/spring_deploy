// ─────────────────────────────────────────────────────
// Jenkins pipeline is DISABLED
// CI/CD is now handled by GitHub Actions (.github/workflows/deploy.yml)
// To re-enable: uncomment the pipeline block below
// ─────────────────────────────────────────────────────

/*
pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'seangngorn68/hello-spring:latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/seangngorn68/spring_deploy.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'docker-hub-credentials',
                    usernameVariable: 'DOCKER_USERNAME',
                    passwordVariable: 'DOCKER_PASSWORD'
                )]) {
                    sh 'echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    docker stop hello-spring || true
                    docker rm hello-spring || true
                    docker run -d -p 9080:9080 --name hello-spring $DOCKER_IMAGE
                '''
            }
        }
    }

    post {
        success {
            echo 'Deploy SUCCESS!'
        }
        failure {
            echo 'Deploy FAILED!'
        }
    }
}
*/
