def call(Map config=[:]){
    def gitTool=tool 'git'
    echo config.url
     echo  "${currentBuild.payload}"
     git branch: 'master', url: "${config.url}"
    
}