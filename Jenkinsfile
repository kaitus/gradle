node{
  stage('SCM Checkout'){
    git 'https://github.com/kaitus/gradle.git'
  }
  
  stage('Compile-Package') {
    sh 'mvn package'
  }
}
