package com.assignment1;

	/*
	 * Q1) Explain the difference between IS-A and Has-A relationship with the help of an
		example and explain about access modifiers and their accessibility?
	 * 
	 *  		difference between IS-A and Has-A relationship :
	 * ===============================================================================================
	 * IS-A is like the object is a type of that object. Here extends keyword is used to achieve
	 * inheritance.
	 * Example : Mammal IS-A Animal
	 * 			 Reptile IS-A Animal
	 * 			 Dog IS-A Animal
	 * -------------------------------
	 * HAS-A relationship are mainly based on the usage. It determines whether a certain class 
	 * HAS-A certain things. This relationship helps to reduce duplication of code.
	 * Example are below :--
	 * 
	 * 		about access modifiers and their accessibility :
	 * ============================================================================================
	 * Access Modifier : Access Modifier is a n thing that helps to restrict the scope of a class,
	 * constructor,variable, method or data member.
	 * Type : There are 4 types of access modifier -
	 * 	1.Default - When no access modifier specified , it is consider by default access Modifier.
	 * 				it is only accessible only inside the similar bundle or package.
	 * 	2.Private - It is only accessible only inside the similar class.
	 * 	3.Public - It is accessible anywhere throughout the program.
	 * 	4.Protected - It is accessible within inside the similar class or package.
	 * 
	 * 
	 * 
	 */



public class Question1 {

	public static void main(String[] args) {
		
		// // IS-A relationship
		Animal a = new Animal();
		Mammal m = new Mammal();
		System.out.println(m instanceof Animal);  // true 
		
	}

}

// IS-A relationship
class Animal{
	
}
class Mammal extends Animal{
	
}
// HAS-A relationship
public class Vehicle{
	
}
public class Speed {
	
}
class Van extends Vehicle{
	private Speed sp;
}

/*
 * This shows that Van HAS-A Speed. By having a separate class for Speed , we can reuse 
 * the Speed class in multiple application
 */




