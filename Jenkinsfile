pipeline{
  agent any
  stages{
    stage('build'){
      when{
        expression{
          branch==master
        }
      }
      steps{
        echo 'build application'
      }
    }
    stage('test'){
      steps{
        echo 'test application'
      }
    }
    stage('deploymant'){
      steps{
        echo 'deployment done'
      }
    }
  }
}
