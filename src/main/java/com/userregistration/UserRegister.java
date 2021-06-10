package com.userregistration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegister {
    // Create a Scanner object
    public static Scanner sc = new Scanner(System.in);
    //Create a Main Method
    public static void main(String[] args) {
        //First Name
        System.out.println("Enter your name:");
        String fname = sc.next();
        Fname myLamda = (fName) -> {
            //regex Pattern use
            String FnameRegex = "^[A-Z]{1}[a-z A-Z]{2,}$";

            Pattern pt = Pattern.compile(FnameRegex);

            if (fName.matches(FnameRegex)) {
                System.out.println("valid name:");
                return "valid";
            }
            else {
                try {
                    throw new UserRegistrationException("invalid name");
                }
                catch(UserRegistrationException m) {
                    System.out.println(m);
                    return "invalid name";
                }
            }
        };

        String result = myLamda.validate_Fname(fname);
        //Last Name
        System.out.println("Enter last name:");
        String lastName = sc.next();

        Lname lastname = (lName) -> {

            String lastName_Regex = "^[A-Z]{1}[a-z A-Z]{2,}$";;

            Pattern pt = Pattern.compile(lastName_Regex);

            if (lName.matches(lastName_Regex)) {

                System.out.println("valid:");
                return "valid";
            }
            else {

                try {
                    throw new UserRegistrationException("invalid name");
                }
                catch(UserRegistrationException m) {
                    System.out.println(m);
                    return "invalid name";
                }
            }
        };
        result = lastname.validate_LastName(lastName);
        //Email
        System.out.println("Enter your email:");
        String emailid = sc.next();

        Email email_id = (email) -> {
            //regex Pattern use
            String emailRegex = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";

            Pattern pt = Pattern.compile(emailRegex);

            if (email.matches(emailRegex)) {

                System.out.println("valid:");
                return "valid";
            }
            else {

                try {
                    throw new UserRegistrationException("invalid email");
                }
                catch(UserRegistrationException m) {
                    System.out.println(m);
                    return "invalid email";
                }
            }
        };
        email_id.Validate_emailId(emailid);
        //Contact
        System.out.println("Enter contact number:");
        String contactnum = "91 8387478383";

        Contact phone = (contact) -> {

            String indianContactNum_Regex = "^[9][1]\\s[6-9]{1}[0-9]{9}$";

            Pattern pt = Pattern.compile(indianContactNum_Regex);

            if (contact.matches(indianContactNum_Regex)) {

                System.out.println("valid:");
                return "valid";
            }
            else {
                try {
                    throw new UserRegistrationException("invalid contact");
                }
                catch(UserRegistrationException m) {
                    System.out.println(m);
                    return "invalid contact";
                }
            }
        };

        phone.Validate_phoneNumber(contactnum);
        //Password
        System.out.println("Enter password:");
        String userpassword = sc.next();

        Password pass = (password) -> {
            //regex Pattern use
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";

            Pattern pt = Pattern.compile(passwordRegex);

            if (password.matches(passwordRegex)) {
                System.out.println("valid:");
                return "valid";
            }
            else {
                try {
                    throw new UserRegistrationException("invalid password");
                }
                catch(UserRegistrationException m) {
                    System.out.println(m);
                    return "invalid password";
                }
            }
        };
        pass.Validate_password(userpassword);


    }

}