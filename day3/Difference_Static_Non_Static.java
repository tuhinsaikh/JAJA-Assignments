package com.assignments;

public class Difference_Static_Non_Static {
	
	int i = 10;  //instance variable 
	
	static int j = 20; //instance variable but static element.
	
	public static void main(String[] args) {
		// can not make static reference to the non-static field.
		//System.err.println(i); // error will show 
		
		System.out.println(j); // we defined j as a static reference so we can access this value inside static field.
		
		// If we want to access the non-static element and method then we have 
		// to create a object inside static field then we can access it.
		
		Difference_Static_Non_Static d1 = new Difference_Static_Non_Static(); // create object class
		System.out.println(d1.i); // here how can access this non-static value.
		
	}
}



/*
All the static elements will be loaded into RAM first, and all the non-static elements will be there inside the hard disk in the form of bytecode in the dot class file.
since static elements are loaded into the RAM, they will be available for the CPU for the execution, but non-static members will not be loaded into the RAM initially. 
So they will not be available to the CPU for the execution.
We can not access the non-static elements from the static area directly.
As soon as the 'new' operator is encountered by the JVM, JVM will allocate some memory space for all the non-static members present inside the dot
 class file and it will load all the non-static elements from the hard disk to the RAM and initializes with their default values if the value is not given, 
 and if any non-static method will be there then the signature and address of the method will be loaded, not the body of the method.

*/