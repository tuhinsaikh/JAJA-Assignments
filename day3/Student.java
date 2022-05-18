package com.assignments;

public class Student {
	
	int roll;
	String name;
	int Masks;
	void displayStudentDetails(int roll,String name,int Masks) {
		System.out.println("Roll is : "+ roll + "\n" + "Name is : "+ name + "\n" + "Marks is : "+ Masks);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 993;
		s1.name = "Tuhin Saikh";
		s1.Masks = 8;
		
		Student s2 = new Student();
		s2.roll = 93;
		s2.name = "Sourav Dhawa";
		s2.Masks = 9;
		
		
		s1.displayStudentDetails(s1.roll,s1.name,s1.Masks);
		s2.displayStudentDetails(s2.roll,s2.name,s2.Masks);
		
		s1 = null;
		s2 = null;
	}
}
