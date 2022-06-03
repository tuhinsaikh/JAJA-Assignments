package com.assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo {
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Citizen c1 = new Citizen();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name_input = sc.next();
//		if(Pattern.matches("[a-zA-Z]{3,8}", name_input)) {
//			c1.setName(name_input);	
//		}else {
//			System.out.println("name should contain only alphabets and length should be min 3 and max 8 characters.");
//		}
		
		System.out.println("Enter Adhaar Number");
		String adhaar_input = sc.next();
//		if(Pattern.matches("[\\d]{12}", adhaar_input)) {
//			c1.setAadharNumber(adhaar_input);	
//		}else {
//			System.out.println("should be numeric and also of length 12.");
//		}
		
		System.out.println("Enter Mobile Number");
		String mobile_input = sc.next();
//		if(Pattern.matches("[9876]{1}[0-9]{9}", mobile_input)) {
//			c1.setMobileNumber(mobile_input);	
//		}else {
//			System.out.println("Indian mobile number starting with 6,7,8,9 and the length should be 10.");
//		}
		
		if(d1.validate(name_input, mobile_input, adhaar_input)) {
			c1.setName(name_input);
			c1.setAadharNumber(adhaar_input);
			c1.setMobileNumber(mobile_input);
			System.out.println("Name : "+c1.getName());
			System.out.println("Adhaar Number: "+c1.getAadharNumber());
			System.out.println("Mobile Number: "+c1.getMobileNumber());
		}
		
	}
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[a-zA-Z]{3,8}", name)) {	
		}else {
			System.out.println("name should contain only alphabets and length should be min 3 and max 8 characters");
			return false;
		}
		
		if(Pattern.matches("[\\d]{12}", aadharCard)) {	
		}else {
			System.out.println("Adhaar should be numeric and also of length 12");
			return false;
		}
		
		if(Pattern.matches("[9876]{1}[0-9]{9}", mobileNum)) {
		}else {
			System.out.println("Indian mobile number starting with 6,7,8,9 and the length should be 10");
			return false;
		}
		
		return true;
	}
	
	
	
}












