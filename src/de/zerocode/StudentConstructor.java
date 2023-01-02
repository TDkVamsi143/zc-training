package de.zerocode;

public class StudentConstructor {
	int id;
	String name;

	// creating a parameterized constructor
	StudentConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		StudentConstructor s1 = new StudentConstructor(111, "vamsi");
		StudentConstructor s2 = new StudentConstructor(222, "hari");
		StudentConstructor s3 = new StudentConstructor(333, "sujwal");
		// calling method to display the values of object
		s1.display();
		s2.display();
		s3.display();
	}
}