def call(Map config=[:]){
   checkout([$class: 'GitSCM', branches: [[name: '*/master']],
    userRemoteConfigs: [[url: config.url]]])
}