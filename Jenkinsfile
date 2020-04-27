pipeline {
   agent any
   stages{
       stage('Git') {
           steps{
               git 'https://github.com/neji69/MyTestCases'
           }
       }
       stage('Test') {
           steps{
               bat label: '', script: 'mvn clean test'
           }
        }
    }
    
    post {
        always {
           allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}