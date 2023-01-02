package de.zerocode;

public class FloatDatatype extends MethodOverloading {
	public int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		FloatDatatype str = new FloatDatatype();
		str.add(3, 4);
		System.out.println(str.add(3, 4));

		float n1 = 10.89f;
		float n2 = 7.43f;
		float n3;

		// multiplied n1 and n2 and stored it in n3
		n3 = n1 * n2;
		System.out.println("The result of n1 x n2 is: " + n3);
	}

}