package com.Day2;

public class PrimeFactor {
	public static void main(String[] args) {
		int num = 66;
//		num = 12;
		if(num>1 & num<=100) {
			for(int i = 1; i<=num; i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}else 
			System.out.println("Invalid number");
		
	}
}
