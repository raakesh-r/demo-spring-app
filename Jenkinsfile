pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage("build jar"){
            steps{
                script{
                    echo "building the application..."
                    sh 'mvn package'
                }
            }
        }
        stage("build image"){
            steps{
                script{
                    echo "building the docker image..."
                    withCredentials([usernamePassword(credentialsId:'docker-credentials',passwordVariable:"PASS", usernameVariable: 'USER')]){
                        sh 'docker build -t raakeshr/demo-app:jma-1.2 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push raakeshr/demo-app:jma-1.2'
                    }
                }
            }
        }
        stage("deploy"){
            steps{
                script{
                    echo "deploying the application..."
                }
            }
        }
