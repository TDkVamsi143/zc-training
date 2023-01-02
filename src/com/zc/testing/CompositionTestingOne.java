package com.zc.testing;

import de.zerocode.Colleges;
import de.zerocode.Student;

public class CompositionTestingOne {

	public static void main(String[] args) {
		Student student = new Student("TDK VAMSI", "194318", "9618588682", "T RAMU", "Mangalagiri");
		Colleges college = new Colleges("PB Siddartha", "Vijayawada", 2000, 60, student);

		System.out.println(college);

		Student studentone = new Student("Nani", "194302", "9390931377", "Narashimha", "vijayawada");
		Colleges collegeone = new Colleges("PB Siddartha", "Vijayawada", 2000, 60, studentone);
		System.out.println(collegeone);

	}

}
