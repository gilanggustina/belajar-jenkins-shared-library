def call(Map config) {
  if (config.type == 'maven') {
    mavenPipeline()
  } else {
    pipeline {
      agent any

      stages {
          stage('Unsupported Pipeline Type') {
              steps {
                  script {
                      echo("Pipeline type '${config.type}' is not supported. Please use 'maven' as the type.")
                  }
              }
          }
      }
    }
  }
}