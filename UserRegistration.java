package com.registrationproblem;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration 
{
	public static boolean validname(String name) 
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
	public static boolean email(String email) {
		String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
		Pattern p = Pattern.compile(regexEmail);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
		
	}
	public static boolean MobileNo(String mobileNo) {
		String regexMobileNo = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regexMobileNo);
		if ( mobileNo == null ){
			return false;
		}
		Matcher m = p.matcher(mobileNo);
		
		return m.matches();
	}
	public static boolean validPassword(String password) {
		String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		Pattern p = Pattern.compile(regexPassword);
		if ( password == null ){
			return false;
		}
		Matcher m = p.matcher(password);
		
		return m.matches();
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration");
		Scanner input = new Scanner(System.in);
		System.out.print("Plase enter the your user First Name: ");
		String userName = input.nextLine();
		System.out.println(validname(userName));
		
	    System.out.print("Plase enter the your User Last Name: ");
		String lastName = input.nextLine();		 
		System.out.println(validname(lastName));
		
		System.out.print("Plase enter the your User Email ID: ");
	    String emailId = input.nextLine();		 
		System.out.println(email(emailId));
		
		System.out.print("Plase enter the your Mobile Number With country code: ");
	    String mobileNo = input.nextLine();		 
		System.out.println(MobileNo(mobileNo));
		
		System.out.print("Enter the password: ");
		String userPassword = input.nextLine();
		System.out.println(validPassword(userPassword));
		
	}
	
}

