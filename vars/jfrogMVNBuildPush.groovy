def call(){
    withCredentials([usernamePassword(
            credentialsId: "JfrogP",
           usernameVariable: "USER",
            passwordVariable: "PASS"
    )])  {
         sh 'curl -X PUT -u $USER:$PASS -T target/*.jar http://3.84.155.9:8082/artifactory/example-repo-local/myapp.jar'
    }
}
