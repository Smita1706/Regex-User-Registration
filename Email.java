package com.bridgelabz.rejex;

import java.util.Scanner;

public class Email {
	private void validateEmail(String email) {
	String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{1,3}([.][A-Za-z]{1})*$";
	boolean result = emailPattern.matches(email) ;
	System.out.println(result);
}
	public static void main(String[] arg) {
		Email em = new Email();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the email :");
		String email = s.next();
		em.validateEmail(email);
	}

	
}
