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
		
	}
	
}

