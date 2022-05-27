package com.assignment2;

public class Question1 {
	/*
	 * Q2) Explain ClassCastException with the help of the example.
	 * Ans : ClassCast Exception is thrown when we try to cast an object 
	 * 		of the parent class to the child class object. However, 
	 * 		it can also be thrown when we try to convert the objects of two 
	 * 		individual classes that don't have any relationship between them.
	 * ---------------------------------------------------------------------------
	 *     public class Animal {  
				String color;  
				Animal(String color){  
						this.color = color;  
				} 
				void eat(String name) {  
						System.out.println(name + " is eating .....");  
				}  
				void show(String name) {  
						System.out.println(name + " is of " + color + " Color");  
				} 
			}
			public class Dog extends Animal{  
				Dog(String color) {  
					super(color);  
				}  
				void eat(String name) {  
					System.out.println(name + " is eating ....");  
				}  
			}
			public class Main {  
				public static void main(String[] args) {   
					Dog dog = new Dog("black");  
					Animal animal = new Animal("White");  
					animal = dog;  
					animal.show("My dog");  
					Animal animal1 = new Animal("White");  
					Dog d = (Dog)animal1;  
				}  
			}   	 

			error in output :-
			My dog is of black Color
			Exception in thread "main" java.lang.ClassCastException:
			class Animal cannot be cast to class Dog
			at Main.main
	 */
}
