package com.bridgelabz.rejex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	private UserRegistration  userRegistration;
	
	 @Before
	   public void initialize() {
		 userRegistration = new UserRegistration();
	   }
	 
	 @Test
	    public void givenFirstNameHappy() {
	        boolean result = userRegistration.validateFirstName("Riya");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstNameSad() {
	        boolean result = userRegistration.validateFirstName("riya");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenLastNameHappy() {
	        boolean result = userRegistration.validateLastName("Jadhav");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastNameSad() {
	        boolean result = userRegistration.validateLastName("jadhav");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenMobileNoHappy() {
	        boolean result = userRegistration.validatePhoneNumber("91 9874563210");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenMobileNoSad() {
	        boolean result = userRegistration.validatePhoneNumber("98745203612");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenEmailHappy() {
	        boolean result = userRegistration.validateEmail("abc@gmail.com");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void givenEmailSad() {
	        boolean result = userRegistration.validateEmail("abc.@gmail.com");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenPasswordOneHappy() {
	        boolean result = userRegistration.validatePasswordOne("abcdbd34");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPasswordOneSad() {
	        boolean result = userRegistration.validatePasswordOne("fhfdhg");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPasswordTwoHappy() {
	        boolean result = userRegistration.validatePasswordTwo("Aghtjkyf");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPasswordTwoSad() {
	        boolean result = userRegistration.validatePasswordTwo("ghjkiuyh");
	        Assert.assertFalse(result);
	    }
	    
	    @Test
	    public void givenPasswordThreeHappy() {
	        boolean result = userRegistration.validatePasswordThree("1Abhujkg");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPasswordThreeSad() {
	        boolean result = userRegistration.validatePasswordThree("Agjgtyfg");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPasswordFourHappy() {
	        boolean result = userRegistration.validatePasswordFour("@A1hjkih");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPasswordFourSad() {
	        boolean result = userRegistration.validatePasswordFour("ghjuykhg");
	        Assert.assertFalse(result);
	    }
	    
}
