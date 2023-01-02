package de.zerocode;

public class Colleges {
	public String collegeName;
	public String collegeAddress;
	public int noOfStudents;
	public int noOfTeachers;
	Student student;

	public Colleges(String collegeName, String collegeAddress, int noOfStudents, int noOfTeachers, Student student) {
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.noOfStudents = noOfStudents;
		this.noOfTeachers = noOfTeachers;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Colleges [collegeName=" + collegeName + ", collegeAddress=" + collegeAddress + ", noOfStudents="
				+ noOfStudents + ", noOfTeachers=" + noOfTeachers + ", student=" + student + "]";
	}
	
}
