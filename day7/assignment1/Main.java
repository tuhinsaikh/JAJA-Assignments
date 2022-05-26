package com.assignment1;

public class Main{
	
	public static void main(String[] args) {
		Member m1 = new Member();
	
		Employee e1 = new Employee();
		
		e1.setName("Tuhin");
		e1.setAge(23);
		e1.setPhone_number("7878787878");
		e1.setAddress("Deuli");
		e1.setSalary(50000.0);
		e1.setSpecialisation("java");
		e1.setDepartment("SDE-1");
		e1.printDetails();
		e1.printSalary();
		
		Manager m2 = new Manager();
		e1.setName("Tuhin Saikh");
		e1.setAge(23);
		e1.setPhone_number("7878787878");
		e1.setAddress("Deuli");
		e1.setSalary(80000.0);
		e1.setSpecialisation("java tech manager");
		e1.setDepartment("Manager");
		e1.printDetails();
		e1.printSalary();
		
	}
}








