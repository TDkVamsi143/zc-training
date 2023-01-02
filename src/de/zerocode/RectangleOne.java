package de.zerocode;

public class RectangleOne implements Shapes {

	public static int getArea(int length, int breadth) {
		return length * breadth;
	}

	@Override
	public String getSides() {

		return "it have 4 sides";
	}

}
