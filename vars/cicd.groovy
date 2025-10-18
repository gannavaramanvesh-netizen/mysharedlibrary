def gitdownload(repo)
{
  git "https://github.com/gannavaramanvesh-netizen/${repo}.git"
}

def buildArtifact()
{
sh 'mvn package'
}
def deploy("job name","ip_address","context path")
{

}
