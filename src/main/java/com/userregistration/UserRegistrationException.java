package com.userregistration;

public class UserRegistrationException extends Exception {
    UserRegistrationException(String message)
    {
        super(message);
    }
}
interface Fname {
    public String validate_Fname(String fName) ;
}

interface Lname {
    public abstract String validate_LastName(String lName);
}

interface Email {
    public abstract String Validate_emailId(String email);
}

interface Contact {
    public abstract String Validate_phoneNumber(String contact);
}

interface Password {
    public abstract String Validate_password(String password);
}