package com.registrationproblem;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
public class UserRegistration 
{
	
	
	//Email
	@Test
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
	
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Plase enter the your User Email ID: ");
	    String emailId = input.nextLine();		 
		email();
	}
	
}

