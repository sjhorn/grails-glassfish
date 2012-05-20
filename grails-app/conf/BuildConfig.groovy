grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits("global") {
		// uncomment to disable ehcache
		// excludes "grails-plugin-log4j", "log4j"
	}
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		//grailsCentral()
		// uncomment the below to enable remote dependency resolution
		// from public Maven repositories
		//mavenCentral()
		//mavenLocal()
		mavenRepo "http://hornmicro.com/maven"
		//mavenRepo "http://snapshots.repository.codehaus.org"
		//mavenRepo "http://repository.codehaus.org"
		//mavenRepo "http://download.java.net/maven/2/"
		//mavenRepo "http://repository.jboss.com/maven2/"
	}
	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
		build 'org.glassfish.main.extras:glassfish-embedded-web-no-slf4j:3.1.2'
		// runtime 'mysql:mysql-connector-java:5.1.5'
		// build 'org.glassfish.main.extras:glassfish-embedded-web:3.1.2'
	}

	plugins {
		build(":release:1.0.0") {
			export = false
		}
	}
}
