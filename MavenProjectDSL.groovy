job('This is a DSL created job'){

decription('This is a DSL job is created by Groovy script using Seed Job at $(new Date())')

scm {
	git('https://github.com/manihere/Jenkins_Upgradev3.git', master)
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
