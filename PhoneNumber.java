package com.bridgelabz.rejex;
import java.util.*;
import java.util.regex.*;
public class PhoneNumber {
	private void validatePhoneNumber(String  number) {
		String p ="^[9][1]{0,1}\\s[0-9]{10}";
		Pattern mob = Pattern.compile(p);
		System.out.println(mob);
		System.out.println(number);
		Matcher result = mob.matcher(number);
		System.out.println(result.matches());
	}
	public static void main(String[] arg) {
		PhoneNumber phone = new PhoneNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the phone number :");
		String number = s.nextLine();
		phone.validatePhoneNumber(number);
	}
}
