pipeline
{
      agent any

      stages{
            stage('Init'){
                 steps{ 
                  echo "Initial stage" 
                  }
            }

            stage('Build'){
                  steps{
                  echo "This is the Build stage"
                  }
            }
            stage('Deploy'){
                  steps{
                        echo "Deploying to Staging environment"
                  }
                  
            }
            stage('Deploy to Prod'){
                  steps{
                        echo "Deploy to Production Environment"
                  }
            }
            }
}