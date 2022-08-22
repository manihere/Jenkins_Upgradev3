job('This is a DSL created job')
{
description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
//decription('This is a DSL job is created by Groovy script using Seed Job at $(new Date())')

//scm {
//	git('https://github.com/manihere/Jenkins_Upgradev3.git', master)
//	}

   scm {
        git {
            remote {
                github('https://github.com/manihere/Jenkins_Upgradev3')
            }
            branch('master')
        }
    }
triggers {
	scm('* * * * *')
	}
steps{
	maven('clean package', 'java-tomcat-sample/pom.xml')
	}
publishers
	{
		archiveArtifacts("**/*.jar")
	}

}
