package com.registrationproblem;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
class AddUserRegistrationTest 
{

	@BeforeEach
	void setUp() throws Exception {
			//check email validate by Parametarized
		 private String emailId;
	     private String expectedResult;
	     public AddUserRegistrationTest(String emailId,String expectedResult)
	     {
	    	 super();
	    	 this.emailId=emailId;
	    	 this.expectedResult=expectedResult;
	     }
	     @Parameterized.Parameters
	     public static Collection input ()
	     {
	         return Arrays.asList( new Object[][] { { "abc@xyz.com", "abc"} });
	     }
	     
	     UserRegistration u = new UserRegistration();
	     Assert.assertEquals(expectedResult, email.setup(emailId) );
	
}