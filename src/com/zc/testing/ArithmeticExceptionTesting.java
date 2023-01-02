package com.zc.testing;

import de.zerocode.exceptionhandling.ArithmeticExceptionHandling;

public class ArithmeticExceptionTesting {

	public static void main(String argvs[]) {
		// creating an object of the class ArithmeticException
		ArithmeticExceptionHandling obj = new ArithmeticExceptionHandling();

		System.out.println(obj.divide(1, 0));
	}

}
