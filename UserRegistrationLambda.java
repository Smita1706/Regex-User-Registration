package com.bridgelabz.rejex;

public class UserRegistrationLambda {
	final String namePattern = "^[A-Z][a-z]{2,}$";
	final String mobilePattern ="^[9][1]{0,1}\\s[0-9]{10}";
	final String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{1,3}([.][A-Za-z]{1})*$";
	final String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*?&]{8,}"; 
	LambdaInterface validateFirstName = (regexPattern) -> (regexPattern.matches(namePattern));
	LambdaInterface validateLastName = (regexPattern) -> (regexPattern.matches(namePattern));
	LambdaInterface validateEmail = (regexPattern) -> (regexPattern.matches(emailPattern));
	LambdaInterface validateMobile = (regexPattern) -> (regexPattern.matches(mobilePattern));
	LambdaInterface validatePassword = (regexPattern) -> (regexPattern.matches(passwordPattern));
}
