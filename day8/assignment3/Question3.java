package com.assignment3;

public class Question3 {
	/*
	 * Q3) Explain dynamic polymorphism ?
	 * 
	 * Ans : 
	 * 
	 * 	In this form of polymorphism in java, the compiler doesn’t determine 
	 * the method to be executed. It’s the Java Virtual Machine (JVM) that performs 
	 * the process at the run time. Dynamic polymorphism refers to the process when 
	 * a call to an overridden process is resolved at the run time. The reference 
	 * variable of a superclass calls the overridden method. 
	 * The methods that are implemented by both the subclass and the superclass provide 
	 * different functionality while sharing the same name.
	 * 
	 * 
	 * class Bike{  

		 void run(){
		 		System.out.println(“running”);
		 	}  
		
		}  
		class Splendor extends Bike{  

		  void run(){
		  		System.out.println(“walking safely with 30km”);
		  }  
		
		    public static void main(String args[]){  
		
		    Bike b = new Splendor();//upcasting  
		
		    b.run();  
		  }  
		
		}  

	 * 
	 */
}
