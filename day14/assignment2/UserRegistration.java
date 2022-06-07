package com.assignment2;

import java.util.Scanner;

public class UserRegistration {

	void registerUser(String username, String userCountry) throws InvalidCountryException {
		//System.out.println();
		if(userCountry.equalsIgnoreCase("india")) {
			System.out.println("User registration done successfully");
		}else {
			InvalidCountryException ICe = new InvalidCountryException("User Outside India cannot be registered");
			throw ICe;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("```````````````````````START MAIN```````````````````");
		
		UserRegistration u1 = new UserRegistration();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Your Country:");
		String country = scan.nextLine();
		
		try {
			u1.registerUser(name, country);
		} catch (InvalidCountryException e) {
			System.out.println(e);
		}
		
	}
}
