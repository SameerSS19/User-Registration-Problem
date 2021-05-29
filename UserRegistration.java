package com.registrationproblem;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
public class UserRegistration 
{
	//Firstname or Lastname
	@Test
	public static boolean givenFirstName_LastName_validname(String name) 
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches(); 
	}
	
	//Email
	@Test
	public static boolean given_email(String email) {
		String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
		Pattern p = Pattern.compile(regexEmail);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	
	}
	
	//MobileNo
	@Test
	public static boolean given_the_MobileNo(String mobileNo) 
	{
		String regexMobileNo = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regexMobileNo);
		if ( mobileNo == null )
		{
			return false;
		}
		Matcher m = p.matcher(mobileNo);
		
		return m.matches();
	}
	
	//Password
	@Test
	public static boolean given_valid_Password(String password) 
	{
		String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern p = Pattern.compile(regexPassword);
		if ( password == null )
		{
			return false;
		}
		Matcher m = p.matcher(password);
		
		return m.matches();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration");
		Scanner input = new Scanner(System.in);
		
		//input 
		System.out.print("Plase enter the your user First Name: ");
		String userName = input.nextLine();
		System.out.println(givenFirstName_LastName_validname(userName));
		
	    System.out.print("Plase enter the your User Last Name: ");
		String lastName = input.nextLine();		 
		System.out.println(givenFirstName_LastName_validname(lastName));
		
		System.out.print("Plase enter the your User Email ID: ");
	    String emailId = input.nextLine();		 
		System.out.println(given_email(emailId));
		
		System.out.print("Plase enter the your Mobile Number With country code: ");
	    String mobileNo = input.nextLine();		 
		System.out.println(given_the_MobileNo(mobileNo));
		
		System.out.print("Please enter the password: ");
		String userPassword = input.nextLine();
		System.out.println(given_valid_Password(userPassword));
		
	}
	
}

