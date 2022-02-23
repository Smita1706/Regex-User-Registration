package com.bridgelabz.rejex;

import java.util.Scanner;

public class PasswordRule2 {
	private void validatePassword(String password) {
		String passwordPattern = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(passwordPattern) ;
		System.out.println(result);
	}
		public static void main(String[] arg) {
			PasswordRule2 pass = new PasswordRule2();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the password :");
			String password = s.next();
			pass.validatePassword(password);
		}

}
