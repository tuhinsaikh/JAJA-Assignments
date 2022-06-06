package com.assignment4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	 boolean validation(String username, String password, String mobileNumber,String email) {
		if(Pattern.matches("[a-zA-Z]{3,8}", username)) {}
		else {
			System.out.println("username should contain only alphabets and length should be min 3 and max characters.");
			return false;
		}
		if(Pattern.matches("[a-zA-Z0-9]{3,8}", password)) {}
		else {
			System.out.println("password should be alpha-numeric and also min 3 and max 8 characters.");
			return false;
		}
		if(Pattern.matches("[9876]{1}[0-9]{9}", mobileNumber)) {}
		else {
			System.out.println("Mobile Number should be an Indian mobile number starting with 6,7,8,9 and the length should be 10.");
			return false;
		}
		if(Pattern.matches("^(.+)@(.+)$", email)) {}
		else {
			System.out.println("Mobile Number should be an Indian mobile number starting with 6,7,8,9 and the length should be 10.");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Customer c = new Customer();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = scan.next();
		
		System.out.println("Enter password");
		String password = scan.next();
		
		System.out.println("Enter mobileNumber");
		String mobileNumber = scan.next();
		
		System.out.println("Enter email");
		String email = scan.next();
		
		if(d1.validation(username, password, mobileNumber, email)) {
			c.setUsername(username);
			c.setMobileNumber(mobileNumber);
			c.setPassword(password);
			c.setEmail(email);
			System.out.println("Username: "+c.getUsername());
			System.out.println("Password: "+c.getPassword());
			System.out.println("Mobile: "+c.getMobileNumber());
			System.out.println("Email: "+ c.getEmail());
		}
		
		
	}

}
