def buildapp(){
  echo 'build successfull"
}
def test(){
  echo "test successfull"
}
def deploy(){
  echo "deploy successfull"
  echo "deploy version ${params.version}"
}
return this
