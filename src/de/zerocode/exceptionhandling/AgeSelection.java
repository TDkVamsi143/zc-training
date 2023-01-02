package de.zerocode.exceptionhandling;

public class AgeSelection {
	public String check(int age) throws Exception {
		if (age < 18) {
			throw new Exception("not eligible");
		}
		return "eligible";

	}
}
