package de.zerocode;

public class Bus extends Vehicle {
	public String getBreak() {
		return "break appiled succesfully";
	}

	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println(bus.getBreak() );
	}
}
