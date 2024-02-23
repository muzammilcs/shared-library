def call(Map config=[:]){
    def gitTool=tool 'git'
    echo config.url
    currentBuild.id=currentBuild.buildNumber + currentBuild.projectName
     git branch: 'master', url: "${config.url}"
    
}