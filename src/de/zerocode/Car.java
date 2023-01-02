package de.zerocode;

public class Car extends Vehicle {

	@Override
	public String getBreak() {
		return "break not working";
	}

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getBreak());
	}

}
