def gitdownload(repo)
{
  git "https://github.com/gannavaramanvesh-netizen/${repo}.git"
}

def buildArtifact()
{
  sh "mvn package"
}



