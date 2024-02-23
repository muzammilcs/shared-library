def call(Map config=[:]){
    def gitTool=tool 'git'
    echo config.url
    currentBuild.id=currentBuild.number + currentBuild.projectName
     git branch: 'master', url: "${config.url}"
    
}