package com.bridgelabz.rejex;

import java.util.Scanner;

public class LastName {
	public void validateFirstName(String name) {
		String lNamePattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(lNamePattern) ;
		System.out.println(result);
	}
	
	public static void main(String[] arg) {
		LastName lName = new LastName();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the last name :");
		String name = s.next();
		lName.validateFirstName(name);
	}
}
