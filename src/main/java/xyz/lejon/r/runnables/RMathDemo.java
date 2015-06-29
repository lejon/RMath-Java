package xyz.lejon.r.runnables;

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
