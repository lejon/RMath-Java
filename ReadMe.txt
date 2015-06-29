To build JAR:

	java -jar jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar -runtime JNA darwin/libRmath.dylib /Users/eralljn/Research/Coding/C/Rlibs/R.framework/Versions/3.2/Resources/include/Rmath.h -mode StandaloneJar
	
To generate Maven:

	java -jar jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar -f -runtime JNA darwin/libRmath.dylib /Users/eralljn/Research/Coding/C/Rlibs/R.framework/Versions/3.2/Resources/include/Rmath.h -mavenArtifactId RMath-Java -mavenGroupId xyz.lejon -mavenVersion 1.0.0 -mode Maven -o tmp/ -package xyz.lejon.r.rmath

Add darwin in JAR:

	jar uf out.jar darwin/libRmath.dylib