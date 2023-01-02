package de.zerocode;

public class Square implements Shapes {

	public static int getArea(int length) {
		return length * length;
	}

	@Override
	public String getSides() {

		return "it have 4 sides";
	}
}
