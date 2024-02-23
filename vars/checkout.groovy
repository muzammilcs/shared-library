def call(){
    def mvnHome=tool 'mvn'
     withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -version'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -version/)
            }
        }
}