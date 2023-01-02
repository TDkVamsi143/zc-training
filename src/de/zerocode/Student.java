package de.zerocode;

public class Student {
	public String studentName;
	public String rollNo;
	public String mobileNo;
	public String fatherName;
	public String address;

	public Student(String studentName, String rollNo, String mobileNo, String fatherName, String address) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
		this.fatherName = fatherName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", mobileNo=" + mobileNo + ", fatherName="
				+ fatherName + ", address=" + address + "]";
	}
}
