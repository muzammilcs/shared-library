def call(Map config=[:]){
    def gitTool=tool 'git'
    echo config.url

     git branch: */master, url: "${config.url}"
    
}