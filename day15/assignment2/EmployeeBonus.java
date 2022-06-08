package com.assignment2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.assignment1.Main;

public class EmployeeBonus {

	public double getbonus(String joiningDate){
		
		LocalDate date = LocalDate.now();
		LocalDate joining = LocalDate.parse(joiningDate);
		long workEx = ChronoUnit.YEARS.between(joining, date);
		long monthEx = ChronoUnit.MONTHS.between(joining, date);
		if(workEx<=1 && monthEx>0) {
			double bonus = 5000;
			return bonus;
		}else if(workEx>1 && workEx<=2) {
			double bonus = 8000;
			return bonus;
		}else if(workEx>2) {
			double bonus = 10000;
			return bonus;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		EmployeeBonus eb = new EmployeeBonus();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input joining date YYYY-MM-DD");
		try {
		String joiningDate = sc.next();
		double bonus = eb.getbonus(joiningDate);
		if(bonus==0) {
			System.out.println("Age should not be in the future");
		}else {
			System.out.println("Your bonus: "+bonus);
		}
		}catch(Exception e) {
			InvalidAgeexception iae = new InvalidAgeexception("Please pass the date in the correct format");
			System.out.println(iae.getMessage());
		}
		System.out.println("------------------end-----------------------------");
		
	}
}
