package com.zc.testing;

import de.zerocode.NumberToWords;

public class NumberToWordTesting {

	public static void main(String[] args) {

		System.out.println("*** " + NumberToWords.convert(0));
		System.out.println("*** " + NumberToWords.convert(1));
		System.out.println("*** " + NumberToWords.convert(16));
		System.out.println("*** " + NumberToWords.convert(100));
		System.out.println("*** " + NumberToWords.convert(118));
		System.out.println("*** " + NumberToWords.convert(200));
		System.out.println("*** " + NumberToWords.convert(219));
		System.out.println("*** " + NumberToWords.convert(800));
		System.out.println("*** " + NumberToWords.convert(801));
		System.out.println("*** " + NumberToWords.convert(1316));
		System.out.println("*** " + NumberToWords.convert(1000000));
		System.out.println("*** " + NumberToWords.convert(2000000));
		System.out.println("*** " + NumberToWords.convert(3000200));
		System.out.println("*** " + NumberToWords.convert(700000));
		System.out.println("*** " + NumberToWords.convert(9000000));
		System.out.println("*** " + NumberToWords.convert(9001000));
		System.out.println("*** " + NumberToWords.convert(123456789));
		System.out.println("*** " + NumberToWords.convert(2147483647));
		System.out.println("*** " + NumberToWords.convert(3000000010L));
	}

}
