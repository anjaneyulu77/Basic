pipeline{
  agent any
  tools{
    git 'git'
  }
  stages{
    stage('build'){
      when{
        expression{
          branch==main
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
