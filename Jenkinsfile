pipeline {
 agent any
  stages {
    stages("run backend") {
      steps {
        echo 'execute gradle...'
        withGradle(){
          sh './gradlew -v'
        }
      }
    }
  }
}
