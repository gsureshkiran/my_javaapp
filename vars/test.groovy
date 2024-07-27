def sonar() {
withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'sonarqube') {
                    
                    sh 'mvn sonar:sonar'
                }

}
def test() {
  sh 'mvn test'
}
def junit() {
  def testresult=junit testResults:'/target/surefire-reports/TEST-*.xml'
}
