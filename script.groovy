def buildapp(){
  echo 'build successfull"
}
def testApp(){
  echo "test successfull"
}
def deployApp(){
  echo "deploy successfull"
  echo "deploy version ${params.version}"
}
return this
