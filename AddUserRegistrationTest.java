package com.registrationproblem;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class AddUserRegistrationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		Scanner sc = new Scanner(System.in);
		UserRegistration u = new UserRegistration();
		
		//first name
		System.out.println("Plase enter the your user First Name:");
		String userName = sc.next();
		boolean first = u.givenFirstName_LastName_validname(userName);
		Assert.assertEquals(first, true);
		
		//lastname
		System.out.println("Plase enter the your User Last Name:");
		String lastName = sc.next();
		boolean last = u.givenFirstName_LastName_validname(lastName);
		Assert.assertEquals(last, true);
		
		//Email
		System.out.println("Plase enter the your User Email ID:");
		String emailId = sc.next();
		boolean email = u.given_email(emailId);
		Assert.assertEquals(email, true);
		
		
		//Password
		System.out.println("Please enter the password:");
		String userPassword = sc.next();
		boolean password = u.given_valid_Password(userPassword);
		Assert.assertEquals(password, true);
		
		
		
		
	}

}
