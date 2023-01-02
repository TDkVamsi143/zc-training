package de.zerocode;

public class MethodOverloading {

	public int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.add(12.3, 12.6));
	}
}
