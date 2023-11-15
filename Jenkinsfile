pipeline {
  agent {
    kubernetes {
      inheritFrom 'maven'
      containerTemplate {
        name 'maven'
        image 'maven:3.8.4-jdk-11'
      }

    }

  }
  stages {
    stage('Clone repository') {
      agent none
      steps {
        git(url: 'https://github.com/xiahui553/springboot-demo', credentialsId: 'xiahui553', branch: 'master', changelog: true, poll: false)
      }
    }

    stage('Run compile') {
      steps {
        container('maven') {
          sh 'mvn compile'
        }

      }
    }

    stage('Run test') {
      steps {
        container('maven') {
          sh 'mvn clean test'
        }

      }
    }

    stage('Run build') {
      steps {
        container('maven') {
          sh 'mvn package'
        }

      }
    }

    stage('Archive artifacts') {
      steps {
        archiveArtifacts(artifacts: 'target/*.jar', followSymlinks: false)
      }
    }

  }
}