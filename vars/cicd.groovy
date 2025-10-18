def gitdownload(repo)
{
  git "https://github.com/gannavaramanvesh-netizen/${repo}.git"
}

def buildArtifact()
{
  sh 'mvn package'
}

def deployTomact(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}"    
}       

def executeselenium(jobname)
{
 sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}



  



     
               
