package com.bridgelabz.rejex;

import java.util.ArrayList;

public class ClearAllEmails {
	public ArrayList<String> addEmails() {
		ArrayList<String> emails = new ArrayList<>();
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");
		
		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc...2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		return emails;
	}
	public boolean isValidEmail(String email) {

		String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
		boolean result = email.matches(emailPattern) ;
		return result;
	}
}
