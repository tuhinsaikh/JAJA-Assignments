package com.assignments;

public class Demo {
	
   public static void main(String[] args) {
	   
	   Student s = Student.getStudent(true);
	   System.out.println("Student roll: "+ s.getRoll());
	   System.out.println("Student name: "+ s.getName());
	   System.out.println("Student address: "+ s.getAddress());
	   System.out.println("Student collage: "+ s.getCollegeName());
	   
	  Student s0 = Student.getStudent(false);
	   System.out.println("Student roll: "+ s0.getRoll());
	   System.out.println("Student name: "+ s0.getName());
	   System.out.println("Student address: "+ s0.getAddress());
	   System.out.println("Student collage: "+ s0.getCollegeName());

	    
}
}
