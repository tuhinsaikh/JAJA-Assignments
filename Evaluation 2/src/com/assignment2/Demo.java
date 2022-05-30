package com.assignment2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input No of Students");
		int noOfStudent = sc.nextInt();
		
		Student [] student = new Student[noOfStudent];
		
		for(int i = 0; i<noOfStudent; i++) {
			student[i] = new Student();
			System.out.println("Roll");
			student[i].setRoll(sc.nextInt());
			System.out.println("name");
			student[i].setName(sc.next());
			System.out.println("Address");
			student[i].setAddress(sc.next());
			System.out.println("marks");
			student[i].setMarks(sc.nextInt());
		}
		
		for(int i = 0; i<noOfStudent; i++) {
			System.out.println("Student " + (i+1));
			System.out.println("Roll : "+student[i].getRoll());
			System.out.println("Name :"+ student[i].getName());
			System.out.println("Address : "+ student[i].getAddress());
			System.out.println("Marks :"+student[i].getMarks());
			System.out.println("=============================================");
		}
		
		double avr = s.getAvr(student, noOfStudent);
		System.out.println("Average marks :" + avr);
		
	}

}
