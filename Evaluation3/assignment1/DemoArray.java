package com.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the number of elements in the array");
		int size = scan.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements in the array");
		for(int i = 0; i<size; i++) {
			arr[i] = scan.nextInt();		
		}
		System.out.println("Enter the index of the array element you want to access");
		int ind = scan.nextInt();
		System.out.println("The array element at index "+ind+" = "+arr[ind]);
		System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException oEx) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException nEx) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch(Exception e) {
			System.out.println(e.getClass());
		}
	}
}
