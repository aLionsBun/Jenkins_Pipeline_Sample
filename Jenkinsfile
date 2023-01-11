// Declaring a pipeline
pipeline {
    /*
    Agents are used to run multiple builds simultaneously with one Jenkins instance
    In this example it's fine for any agent to build the project
    */
    agent any

    // Defining pipeline stages
    stages {
        // Building sample project
        stage ('Build') {
            steps {
                withMaven {
                    echo "Building project"
                    sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        // Running project tests
        stage ('Test') {
            steps {
                withMaven {
                    echo "Running tests"
                    sh 'mvn test'
                }
            }
        }

        // Deploying sample project
        stage ('Deploy') {
            steps {
                withAWS(region:'us-east-1',credentials:'aws_credentials') {
                    sh 'echo "Deploying to S3"'
                    s3Upload(bucket: 'bilous-jenkins-build-artifacts', file: 'target/*.jar')
                }
            }
        }
    }
}
