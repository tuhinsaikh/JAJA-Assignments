package com.assignment1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			TajHotel t1 = new TajHotel();
			return t1;
		}else if(amount>=200 && amount<1000) {
			RoadSideHotel r1 = new RoadSideHotel();
			return r1;
		}else return null;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ammount");
		int ammount = scanner.nextInt();
		Hotel h = d1.provideFood(ammount);
		if(h ==null) {
			System.out.println("Please Enter valid amount");
		}else {
			h.chickenBiryani();
			h.masalaDosa();
			if(h instanceof TajHotel) {
				((TajHotel) h).welcomeDrink();
			}
		}
		
		
	}
}
