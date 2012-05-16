grails-glassfish plugin
=======================

A plugin to run glassfish in dev mode. 

Forked originally from [kiRach/grails-glassfish](https://github.com/kiRach/grails-glassfish). 

I have packaged the glassfish-embedded-web jar in lib without slf4j to allow things to run in grails 2.0.3. 

There are some interested challenges in getting glassfish v3 dependencies without conflicts, so I opted to check out the source and adjust the ant-scripts used for building the embedded jars to exclude the old version of slf4j included in the version of bean-validator.

To install from source
----------------------

	git clone git@github.com:sjhorn/grails-glassfish.git
	grails package-plugin
	cd <to your project> 
	grails install-plugin grails-glassfish-0.1.zip
	
	
To install plugin directly
--------------------------
   Todo.

