def call() {
withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'sonarqube') {
                    
                    sh 'mvn sonar:sonar'
                }

}
