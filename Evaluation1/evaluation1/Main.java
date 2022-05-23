package com.evaluation1;

import java.util.Scanner;

//Question 4:
public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Roll Number :");
		s.setRollNumber(sc.nextInt());
		
		System.out.println("Enter the Name :");
		s.setStudentName(sc.next());
		
		System.out.println("Enter the marks :");
		s.setMarks(sc.nextInt());
		
		System.out.println("Student Detail "+ 01);
		System.out.println("Student Detail :"+s.getRollNumber());
		System.out.println("Student Roll Number: "+s.getStudentName());
		System.out.println("Student Mark: "+s.getMarks());
		
	}
}


/*
Enter the Roll Number :
1
Enter the Name :
Sam
Enter the marks :
567

Student Detail 01
Student Roll Number:567.0
Student Name:Sam
Student Mark:567.0
 */