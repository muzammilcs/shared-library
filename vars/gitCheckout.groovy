def call(Map config=[:]){
    echo config.url
   checkout([$class: 'GitSCM', branches: [[name: '*/master']],
    userRemoteConfigs: [[url: config.url]]])
}