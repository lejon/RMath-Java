RMath-Java
==========

RMath-Java is a Java wrapper of R's C library of math functions. If you are not interested in the whole GIT repo you can just download the latest release of the JAR file (from the Releases section) and add it to your CLASSPATH. 

Currently the it only works on Mac OS X and Linux x86, since I haven't compiled the native for the other OS'es yet.

## Basic usage 

Add 'RMath-Java-X.X.X.jar' to your classpath.
  
```java

import xyz.lejon.r.rmath.RmathLibrary;

public class RMathDemo {

	public static void main(String[] args) {
		RmathLibrary rmath = RmathLibrary.INSTANCE;

		double shape=5.5;
		double scale=4.931580119094013E-6;
		int lowerTail = 1;
		int useLog = 0; 
		
		rmath.set_seed((int)System.currentTimeMillis(), 0);
		
		System.out.printf("Drew standard normal random covariate %f\n", rmath.rnorm(0.0, 1.0));
		double gd = rmath.rgamma(shape, scale);
	    System.out.printf("Drew gamma random variate %f\n", gd);
	    System.out.printf("The cumulative density (CDF) of the gamma distribution at " + gd + " is %f\n", rmath.pgamma(gd,shape,scale,lowerTail,useLog));
	    System.out.printf("The probability density function (PDF) of the gamma distribution at " + gd + " is %f\n", rmath.dgamma(gd,shape,scale,useLog));
	    System.out.printf("The inverse cumulative density (quantile) of the gamma distribution at " + gd + " is %f\n", rmath.qgamma(gd, shape, scale,lowerTail,useLog));
	}
}
```

Results in:

```
Drew standard normal random covariate -1.269737
Drew gamma random variate 0.000021
The cumulative density (CDF) of the gamma distribution at 2.110755126439184E-5 is 0.337581
The probability density function (PDF) of the gamma distribution at 2.110755126439184E-5 is 37228.494674
The inverse cumulative density (quantile) of the gamma distribution at 2.110755126439184E-5 is 0.000002
```

## Supported Architectures

* Mac OS X
* Linux x86 64 bit 

## R Version 

R Version 3.2.1

## License

Same as R! :)

Enjoy!
-Leif
  