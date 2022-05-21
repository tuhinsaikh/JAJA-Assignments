package com.assignment;


/*
 * Write a non-static method inside a java class that accepts a whole number and prints
	the same number if the input is Odd. If the input is even, it should print the next multiple
	of ten. If the input is negative, print the string: “Error”.
	Input: 44, output: 50
	Input: 45, output: 45
	Input: -5, output: Error
 */

public class Problem4 {
	void oddEven(int input) {
		if(input<0) {
			System.out.println("Error");
		}else if(input%2==1) {
			System.out.println(input);
		}else if(input%2==0) {
			if(input%10==0) {
				System.out.println(input);
			}else {
				for(int i = input;true;i++) {
					if(i%10==0) {
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		//int input = 5;
		new Problem4().oddEven(12);
		
	}
}
