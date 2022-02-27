package com.bridgelabz.rejex;

public class UserRegistration {
	public boolean validateFirstName(String name) {
		String fNamePattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(fNamePattern) ;
		return result;
	}
	public boolean validateLastName(String name) {
		String lNamePattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(lNamePattern);
		return result;
	}
	boolean validatePhoneNumber(String  number) {
		String pattern ="^[9][1]{0,1}\\s[0-9]{10}";
		boolean result = number.matches(pattern);
		return result;

	}
	boolean validateEmail(String email) {
		String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{1,3}([.][A-Za-z]{1})*$";
		boolean result = email.matches(emailPattern) ;
		return result;
	}
	boolean validatePasswordOne(String password) {
		String passwordPattern = "^[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(passwordPattern) ;
		return result;
	}
	boolean validatePasswordTwo(String password) {
		String passwordPattern = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(passwordPattern) ;
		return result;
	}
	boolean validatePasswordThree(String password) {
		String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(passwordPattern) ;
		return result;
	}
	boolean validatePasswordFour(String password) {
		String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*?&]{8,}";
		boolean result = password.matches(passwordPattern) ;
		return result;
	}
}
