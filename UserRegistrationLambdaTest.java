package com.bridgelabz.rejex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationLambdaTest {
	private UserRegistrationLambda  userRegistrationLambda;
	
	 @Before
	   public void initialize() {
		 userRegistrationLambda = new UserRegistrationLambda();
	   }
	 
	 @Test
	    public void givenFirstNameValid() {
	        boolean result = userRegistrationLambda.validateFirstName.validate("Smita");
	        Assert.assertTrue(result);
	    }
	  @Test
	    public void givenLastNameValid() {
	        boolean result = userRegistrationLambda.validateLastName.validate("Jadhav");
	        Assert.assertTrue(result);
	    }
	  @Test
	    public void givenMobileNoValid() {
	        boolean result = userRegistrationLambda.validateMobile.validate("91 9874563210");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void givenEmailValid() {
	        boolean result = userRegistrationLambda.validateEmail.validate("abc@gmail.com");
	        Assert.assertTrue(result);
	    }
	   
	    @Test
	    public void givenPasswordValid() {
	        boolean result = userRegistrationLambda.validatePassword.validate("@A1hjkih");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void givenFirstNameInValid() {
	        boolean result = userRegistrationLambda.validateFirstName.validate("smita");
	        Assert.assertFalse(result);
	    }
	  @Test
	    public void givenLastNameInValid() {
	        boolean result = userRegistrationLambda.validateLastName.validate("jadhav");
	        Assert.assertFalse(result);
	    }
	  @Test
	    public void givenMobileNoInValid() {
	        boolean result = userRegistrationLambda.validateMobile.validate("919874563210");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenEmailInValid() {
	        boolean result = userRegistrationLambda.validateEmail.validate("abc@xyz@gmail.com");
	        Assert.assertFalse(result);
	    }
	   
	    @Test
	    public void givenPasswordInValid() {
	        boolean result = userRegistrationLambda.validatePassword.validate("a1fghjkih");
	        Assert.assertFalse(result);
	    }
}
