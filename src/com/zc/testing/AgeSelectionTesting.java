package com.zc.testing;

import de.zerocode.exceptionhandling.AgeSelection;

public class AgeSelectionTesting {

	public static void main(String[] args) {
		AgeSelection exp = new AgeSelection();
		try {
			System.out.println(exp.check(12));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
