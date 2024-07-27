def sonar() {
withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'sonarqube') {
                    
                    sh 'mvn sonar:sonar'
                }

}
