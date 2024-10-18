def call(){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            JFROG_USERNAME: "USER",
            JFROG_PASSWORD: "PASS"
    )])  {
         sh 'curl -X PUT -u ${JFROG_USERNAME}:${JFROG_PASSWORD} -T target/*.jar http://${JFROG_ARTIFACTORY_URL}/artifactory/libs-release-local/myapp.jar
    }
}
