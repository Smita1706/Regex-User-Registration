package com.bridgelabz.rejex;

public class UserRegistrationTryCatch {
	public  boolean validateFirstName(String firstName) throws UserRegistrationException {
		try {
			String lNamePattern = "^[A-Z][a-z]{2,}$";
			boolean result = firstName.matches(lNamePattern);
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
    }
	public boolean validateLastName(String name) throws UserRegistrationException {
		try {
			String lNamePattern = "^[A-Z][a-z]{2,}$";
			boolean result = name.matches(lNamePattern);
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validatePhoneNumber(String  number) throws UserRegistrationException {
		try {
			String pattern ="^[9][1]{0,1}\\s[0-9]{10}";
			boolean result = number.matches(pattern);
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validateEmail(String email) throws UserRegistrationException {
		try {
			String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{1,3}([.][A-Za-z]{1})*$";
			boolean result = email.matches(emailPattern) ;
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validatePasswordOne(String password) throws UserRegistrationException {
		try {
			String passwordPattern = "^[a-zA-Z0-9]{8,}$";
			boolean result = password.matches(passwordPattern) ;
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validatePasswordTwo(String password) throws UserRegistrationException {
		try {
			String passwordPattern = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
			boolean result = password.matches(passwordPattern) ;
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validatePasswordThree(String password) throws UserRegistrationException {
		try {
			String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
			boolean result = password.matches(passwordPattern) ;
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
	boolean validatePasswordFour(String password) throws UserRegistrationException {
		try {
			String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*?&]{8,}";
			boolean result = password.matches(passwordPattern) ;
			return result;
		}catch(Exception e) {
			throw new UserRegistrationException("Invalid Entry!");	
		}
	}
}
