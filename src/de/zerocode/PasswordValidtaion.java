package de.zerocode;

import java.util.regex.Pattern;

public class PasswordValidtaion {
	public boolean getValidate(String input) {
		return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&$]).{8,15}$").matcher(input).find();
	}
}
