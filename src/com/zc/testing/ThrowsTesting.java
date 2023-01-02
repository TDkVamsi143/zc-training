package com.zc.testing;

import de.zerocode.exceptionhandling.*;

public class ThrowsTesting {

	public static void main(String[] args) {
		Throws tro = new Throws();

		try {
			System.out.println(tro.divide(6, 0));
		} catch (ArithmeticException exp) {
			System.out.println("exp");
			exp.printStackTrace();
		}

	}
}
