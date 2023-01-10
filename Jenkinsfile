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
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        // Running project tests
        stage ('Test') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }

        // Deploying sample project
        stage ('Deploy') {
            steps {
                echo "Building and testing successful! Project is ready to be deployed!"
            }
        }
    }
}
