package com.bridgelabz.rejex;
import java.util.Scanner;
import java.util.regex.*;
public class FirstName {

	public void validateFirstName(String name) {
		String fNamePattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(fNamePattern) ;
		System.out.println(result);
	}
	
	public static void main(String[] arg) {
		FirstName fName = new FirstName();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first the name :");
		String name = s.next();
		fName.validateFirstName(name);
	}
	
}
