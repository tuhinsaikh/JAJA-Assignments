package com.assignment;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	// zero arguments constructor 
	public Student() {
		
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	
	
	//parameterized constructor
	public Student(int roll,String name, int age, int marks) {
			this.roll = roll;
			this.name = name;
			this.age = age;
			this.marks = marks;
	}
	
	// data ------------------->
	public void showDetails() {
		if(age>18 && age<60 && marks>0 && marks<500) {
			 System.out.println("Roll is :"+roll); 
			 System.out.println("Name is :"+name);  
			 System.out.println("Age is :" +age );
			 System.out.println("Marks is :"+marks);
		}else {
			System.out.println("age should be between 18 and 60 and marks should be between 0 and 500");
		}
	}
}
