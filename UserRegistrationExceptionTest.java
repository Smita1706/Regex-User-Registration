package com.bridgelabz.rejex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationExceptionTest {
	private UserRegistrationTryCatch  userRegistration;

	@Before
	public void initialize() {
		userRegistration = new UserRegistrationTryCatch();
	}

	@Test
	public void givenFirstNameHappy() {
		try {
			boolean result = userRegistration.validateFirstName("Riya");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstNameSad() {
		try {
			boolean result = userRegistration.validateFirstName("riya");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenLastNameHappy() {
		try {
			boolean result = userRegistration.validateLastName("Jadhav");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastNameSad() {
		try {
			boolean result = userRegistration.validateLastName("jadhav");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenMobileNoHappy() {
		try {
			boolean result = userRegistration.validatePhoneNumber("91 9874563210");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMobileNoSad() {
		try {
			boolean result = userRegistration.validatePhoneNumber("98745203612");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenEmailHappy() {
		try {
			boolean result = userRegistration.validateEmail("abc@gmail.com");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenEmailSad() {
		try {
			boolean result = userRegistration.validateEmail("abc.@gmail.com");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenPasswordOneHappy() {
		try {
			boolean result = userRegistration.validatePasswordOne("sgduf45yd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordOneSad() {
		try {
			boolean result = userRegistration.validatePasswordOne("jdvhg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordTwoHappy() {
		try {
			boolean result = userRegistration.validatePasswordTwo("xshjsGAsf");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordTwoSad() {
		try {
			boolean result = userRegistration.validatePasswordTwo("xsyfgadg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordThreeHappy() {
		try {
			boolean result = userRegistration.validatePasswordThree("D8bhadddd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordThreeSad() {
		try {
			boolean result = userRegistration.validatePasswordThree("Ahdfjdhjgd");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordFourHappy() {
		try {
			boolean result = userRegistration.validatePasswordFour("A@hgd4hdg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordFourSad() {
		try {
			boolean result = userRegistration.validatePasswordFour("gsaofhg");
			Assert.assertTrue(result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}

	}

}
