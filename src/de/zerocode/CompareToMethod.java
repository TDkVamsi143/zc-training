package de.zerocode;

public class CompareToMethod {

	public static void main(String[] args) {
		String s1 = "vamsi";
		String s2 = "vamsi";
		String s3 = "nani";
		String s4 = "yogi";
		String s5 = "prasad";
		System.out.println(s1.compareTo(s2));// 0 because both are equal
		System.out.println(s1.compareTo(s3));// 8 because "v" is 8 times lower than "n"
		System.out.println(s1.compareTo(s4));// -3 because "v" is 3 times lower than "y"
		System.out.println(s1.compareTo(s5));// 6 because "v" is 6 times greater than "p"
	}
}
