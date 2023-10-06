def gv
pipeline{
  agent any
  tools{
    git 'git'
  }
  parameters{
     choice(name: 'version', choices: [1.0, 1.1, 1.2], description: '')
     booleanParam(name: 'executetests', defaultValue: true, description: '')
  }
  stages{
    stage('load groovy'){
      steps{
        script{
          gv = load "script.groovy"
        }
      }
    }
    stage('build'){
      steps{
        script{
          gv.buildApp()
        }
      }
    }
    stage('test'){
      when {
        expression{
          params.executetests
        }
      }
      steps{
        script{
          gv.testApp()
        }
      }
    }
    stage('deploymant'){
      steps{
        script{
        gv.deployApp()
        }
      }
    }
  }
}
