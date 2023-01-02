package com.zc.testing;

import de.zerocode.Developer;

public class SingleInheritanceTesting {

	public static void main(String args[]) {
		Developer d = new Developer();
		d.salary(); // calls method of super class
		d.bonus(); // calls method of sub class
	}
}
