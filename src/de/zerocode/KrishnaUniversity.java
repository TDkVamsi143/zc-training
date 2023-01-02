package de.zerocode;

import java.util.List;

public class KrishnaUniversity {
	List<College> colleges;

	public KrishnaUniversity(List<College> colleges) {
		this.colleges = colleges;
	}

	// Getting total number of colleges
	public List<College> getTotalCollegesInUniversity() {
		return colleges;
	}
}
