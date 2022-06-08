package com.assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Main {
	
	static void getAge(LocalDate Dob, LocalDate curD) {
		
		long age = ChronoUnit.YEARS.between(Dob, curD);
		if(age>=0) {
			System.out.println("Age: "+age);
		}else {
			System.out.println("Date should not be in Future");
		}
		
	}

	public static void main(String[] args) {
		
		LocalDate curD = LocalDate.now();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of Birth in YYYY-MM-DD format");
		String dob = sc.next();
		try {
			LocalDate Dob = LocalDate.parse(dob);
			Main.getAge(Dob,curD);
		}catch(Exception e) {
			InvalidDateFormat Idf = new InvalidDateFormat("InvalidDateFormat");
			System.out.println(Idf.getMessage());
		}
		
		System.out.println("application successfully closed!..");
	}

}
