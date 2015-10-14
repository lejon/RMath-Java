To build R Math stand alone:

	Build the standalone Linux library.

	Since you are here and have configured and built the Linux R anyway, you can make the standalone Linux library at this point if you wish:

	cd $RDIRL/src/nmath/standalone
	make 

	make test
	./test 
	
	Then copy the Linux libraries:

	cp libRmath.so jnaerator/linux-x86


To build JAR:

	java -jar jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar -runtime JNA darwin/libRmath.dylib /Users/eralljn/Research/Coding/C/Rlibs/R.framework/Versions/3.2/Resources/include/Rmath.h -mode StandaloneJar
	
To generate Maven:

	java -jar jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar -f -runtime JNA darwin/libRmath.dylib /Users/eralljn/Research/Coding/C/Rlibs/R.framework/Versions/3.2/Resources/include/Rmath.h -mavenArtifactId RMath-Java -mavenGroupId xyz.lejon -mavenVersion 1.0.0 -mode Maven -o tmp/ -package xyz.lejon.r.rmath

Add darwin in JAR:

	jar uf out.jar darwin/libRmath.dylib
	
	jar uf out.jar linux-x86-64/libRmath.so