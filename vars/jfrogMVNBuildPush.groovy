def call(credentialsId){
    withCredentials([usernamePassword(
            jcredentialsId: credentialsId,
            JFROG_USERNAME: "USER",
            JFROG_PASSWORD: "PASS"
    )])  {
         sh 'curl -X PUT -u $USER:$PASS -T target/*.jar http://44.211.126.159:8082/artifactory/example-repo-local/myapp.jar'
    }
}
