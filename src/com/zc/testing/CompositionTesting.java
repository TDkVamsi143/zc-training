package com.zc.testing;


import java.util.ArrayList;
import java.util.List;

import de.zerocode.*;


public class CompositionTesting {

	public static void main(String[] args) {
		{
			// Creating the Objects of College class.
			College one = new College("PB Siddartha College", "Vijayawada");
			College two = new College("VR Siddartha Engineering College", "Vijayawada");
			College three = new College("KBN College of Engineering & Management Sudies", "Vijayawada");
			// Creating list which contains the no. of colleges.
			List<College> college = new ArrayList<College>();
			college.add(one);
			college.add(two);
			college.add(three);
			KrishnaUniversity university = new KrishnaUniversity(college);
			List<College> colleges = university.getTotalCollegesInUniversity();
			for (College cg : colleges) {
				System.out.println("Name : " + cg.name + " and " + " Address : " + cg.address);
			}
		}
	}
}