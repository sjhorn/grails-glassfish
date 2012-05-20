grails-glassfish plugin
=======================

A plugin to run glassfish in dev mode. 

Forked originally from [kiRach/grails-glassfish](https://github.com/kiRach/grails-glassfish). 

I have packaged the glassfish-embedded-web jar in lib without slf4j to allow things to run in grails 2.0.3. 

There are some challenges getting glassfish v3 dependencies without conflicts, so I opted to check out the source and adjust the ant-scripts used for building the embedded jars to exclude the old version of slf4j included in the version of bean-validator.

*More explanation of the steps I took to go here*


To install from source
----------------------

	git clone git@github.com:sjhorn/grails-glassfish.git
	grails package-plugin
	cd <to your project> 
	grails install-plugin grails-glassfish-0.1.zip
	
	
To install plugin directly
--------------------------
   Todo.


Alternative Options
===================

*If you would prefer not to point to my one-off maven repo (ie. http://hornmicro.com/maven) you can try one of the options below.* 


Option 1. Add glassfish jar to your local maven repo
--------------------------------------------

Currently the following maven repo is used for the no-slf4j glassfish in the BuildConfig.groovy file. 

	mavenRepo "http://hornmicro.com/maven"

If you would prefer to install the single dependency to your local maven repo you can do the following:

Download the [glassfish-embedded-web jar](https://github.com/downloads/sjhorn/grails-glassfish/glassfish-embedded-web-no-slf4j-3.1.2.jar)

Install the jar in your local maven repo

    mvn install:install-file  \
    					  -Dfile=glassfish-embedded-web-no-slf4j-3.1.2.jar \
                          -DgroupId=org.glassfish.main.extras \
                          -DartifactId=glassfish-embedded-web-no-slf4j \
                          -Dversion=3.1.2 \
                          -Dpackaging=jar

Adjust the plugins BuildConfig.groovy to use your local maven repo
    mavenLocal()


Option 2. Add glassfish jar to your local ivy repository
----------------------------------------------

Download [glassfish-embedded-web jar](https://github.com/downloads/sjhorn/grails-glassfish/glassfish-embedded-web-no-slf4j-3.1.2.jar) and move to

    $HOME/.ivy2/local/org.glassfish.main.extras/glassfish-embedded-web-no-slf4j/3.1.2/jars/glassfish-embedded-web-no-slf4j.jar




