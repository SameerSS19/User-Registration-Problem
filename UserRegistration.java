package com.registrationproblem;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

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
	public static void email() 
	{
		 ArrayList<String> emails = new ArrayList<String>(); 
		 emails.add("abc@yahoo.com");
		 emails.add("abc-100@yahoo.com");
		 emails.add("abc.100@yahoo.com");
		 emails.add("abc111@abc.com");
		 emails.add("abc-100@abc.net");
		 emails.add("abc.100@abc.com.au");
		 emails.add("abc@1.com");
		 emails.add("abc@gmail.com");
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
		 emails.add("abc..2002@gmail.com");
		 emails.add("abc.@gmail.com");
		 emails.add("abc@abc@gmail.com");
		 emails.add("abc@gmail.com.1a");
		 emails.add("abc@gmail.com.aa.au");
		 
		 String regexEmail = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
		 Pattern p = Pattern.compile(regexEmail);
		 
		 for(String email : emails) 
		 {     
	     Matcher matcher = p.matcher(email);  
	     System.out.println(email +" : "+ matcher.matches()+"\n");  
	     } 	
	}
	public static boolean MobileNo(String mobileNo) 
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
	public static boolean validPassword(String password) 
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
		System.out.print("Plase enter the your user First Name: ");
		String userName = input.nextLine();
		System.out.println(validname(userName));
		
	    System.out.print("Plase enter the your User Last Name: ");
		String lastName = input.nextLine();		 
		System.out.println(validname(lastName));
		
		System.out.println("Lets validate email addreess");
		email();
		
		System.out.print("Plase enter the your Mobile Number With country code: ");
	    String mobileNo = input.nextLine();		 
		System.out.println(MobileNo(mobileNo));
		
		System.out.print("Enter the password: ");
		String userPassword = input.nextLine();
		System.out.println(validPassword(userPassword));
		
			
		
	}
	
}

