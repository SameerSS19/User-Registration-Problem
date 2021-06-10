package com.userregistration;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.regex.Pattern;
public class UserRegistrationTest
{
    public static String fname;

    @Test
    //First name
    public void test() {
        String fname = "Sameer";

        String result = myLamda.validate_Fname(fname);

        assertEquals("valid",result);

        fname = "Khan";

        result = myLamda.validate_Fname(fname);

        assertThrows(UserRegistrationException.class,myLamda.validate_Fname(fname));
    }

    private void assertThrows(Class<UserRegistrationException> class1, String validate_Fname) {


    }

    Fname myLamda = (fName) -> {
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

    @Test
    //Last Name
    public void lastnameTest()
    {
        String lname = "Khan";

        String result = lastname.validate_LastName(lname);

        assertEquals("valid",result);

        lname = "Khan";

        result = lastname.validate_LastName(lname);

        assertThrows(UserRegistrationException.class,lastname.validate_LastName(lname));

    }
    private void assertThrows1(Class<UserRegistrationException> class1, String validate_LastName) {


    }


    Lname lastname = (lName) -> {

        String lastName_Regex = "^[A-Z]{1}[a-z A-Z]{2,}$";

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

    @Test
    //Email
    public void emailTest()
    {
        String email = "abc.xyz@gmail.co.in";

        String result = email_id.Validate_emailId(email);

        assertEquals("valid",result);

        email = "Abc.xyz@gmail.co.in";

        result = email_id.Validate_emailId(email);

        assertThrows(UserRegistrationException.class,email_id.Validate_emailId(email));

    }

    private void assertThrows2(Class<UserRegistrationException> class1, String Validate_emailId) {


    }

    Email email_id = (email) -> {

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

    @Test
    //Contact
    public void contactTest() {
        String contact = "91 9971085839";

        String result = phone.Validate_phoneNumber(contact);

        assertEquals("valid",result);

        contact = "1abcxyz@123";

        result = phone.Validate_phoneNumber(contact);

        assertThrows(UserRegistrationException.class,phone.Validate_phoneNumber(contact));

    }

    private void assertThrows3(Class<UserRegistrationException> class1, String Validate_phoneNumber) {


    }

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

    @Test
    //Password
    public void passwordTest()
    {
        String password = "Skm@123a";

        String result = pass.Validate_password(password);;

        assertEquals("valid",result);

        password = "2nskkdjs@123";

        result = pass.Validate_password(password);

        assertThrows(UserRegistrationException.class,pass.Validate_password(password));
    }

    private void assertThrows4(Class<UserRegistrationException> class1, String Validate_password) {


    }


    Password pass = (password) -> {

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


}