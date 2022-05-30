package com.assignment2;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		
	}
	
	public Student(int roll, String name, String address, int marks) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public double getAvr(Student[] s, int noOfStudent) {
		int total = 0;
		for(int i = 0; i<s.length; i++) {
			total += s[i].getMarks();		
		}
		double avr = (total/noOfStudent);
		return avr;
	}
}
