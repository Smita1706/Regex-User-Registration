package com.bridgelabz.rejex;

import java.util.Scanner;

public class PhoneNumber {
	
	private void validatePhoneNumber(String  number) {
		String phNoPattern = "^(\\d{0,9}[\\s]?)?\\d{10}$";
		boolean result = number.matches(phNoPattern);
		System.out.println(result);
	}
		public static void main(String[] arg) {
			PhoneNumber phone = new PhoneNumber();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the phone number :");
			String number = s.next();
			phone.validatePhoneNumber(number);
		}
}
