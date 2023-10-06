pipeline{
  agent any
  tools{
    git 'git'
  }
  parameters{
     choice[name: 'version', choices: [1.0, 1.1, 1.2], description: '']
     booleanparam[name: 'executetests', defaultValue: true, description: '']
  }
  stages{
    stage('build'){
      steps{
        echo 'build application'
      }
    }
    stage('test'){
      steps{
        when{
          expression{
            param.executeTests
          }
        }
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
