pipeline{
     agent any
     environment{
            DOCKER_TAG=getDockerTag()
      }
     stages{
          stage('Build Docker Image'){
                steps{
                    sh "sudo docker build -t testingmanoj/manoj:${DOCKER_TAG} ."
                }
           }
     }
}

def getDockerTag(){
   def tag=sh script: 'git rev-parse HEAD',returnStdout:true
   return tag

}
