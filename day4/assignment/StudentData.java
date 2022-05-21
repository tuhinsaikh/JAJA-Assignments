package com.assignment;

public class StudentData {
	
	public static void main(String[] args) {
		
		//using zero argument constructor 
		Student s2 = new Student();
		s2.setRoll(15);
		s2.setName("tuhin");
		s2.setAge(29);
		s2.setMarks(20);
		s2.showDetails();
		
		System.out.println(s2.getName());
		
		
		
		//using parameterized constructor
		Student s1 = new Student(23,"Tuhin",23,10);
		s1.showDetails();
		
	}
}
