def call(){
    withCredentials([JusernamePassword(
            jcredentialsId: "JfrogP",
            JFROG_USERNAME: "USER",
            JFROG_PASSWORD: "PASS"
    )])  {
         sh 'curl -X PUT -u ${JFROG_USERNAME}:${JFROG_PASSWORD} -T target/*.jar http://44.211.126.159:8082/artifactory/example-repo-local/myapp.jar'
    }
}
