RMath-Java
==========

This is a Java wrapper of the R math library.

Basic usage: 
  
```java

import xyz.lejon.r.rmath.RmathLibrary;

public class RMathDemo {

	public static void main(String[] args) {
		RmathLibrary rmath = RmathLibrary.INSTANCE;

		double shape=5.5;
		double scale=4.931580119094013E-6;
		int lowerTail = 1;
		int useLog = 0; 
		
		System.out.printf("Drew normal %f\n", rmath.rnorm(0.0, 1.0));
		double gd = rmath.rgamma(shape, scale);
	    System.out.printf("Drew gamma %f\n", gd);
	    System.out.printf("It has cdf gamma %f\n", rmath.pgamma(gd,shape,scale,lowerTail,useLog));
	    System.out.printf("It has pdf gamma %f\n", rmath.dgamma(gd,shape,scale,useLog));
	    System.out.printf("It has quantile gamma %f\n", rmath.qgamma(gd, shape, scale,lowerTail,useLog));
	}
}
```

## License

Same as R! :)

Enjoy!
-Leif
  