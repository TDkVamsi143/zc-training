package com.zc.testing;

import de.zerocode.Cricket;
import de.zerocode.Football;
import de.zerocode.Sports;

public class UpcastingTesting {

	public static void main(String[] args) {

		Sports sportOne = new Cricket();
		sportOne.displayName();

		Football sportTwo = new Football();
		// calling method
		sportTwo.displayName();

	}

}
