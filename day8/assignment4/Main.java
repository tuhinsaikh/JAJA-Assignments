package com.assignment4;

public class Main {
	public static void main(String[] args){
		//create an array of Animal class with size 3
		Animal [] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		//initialize all 3 elements of this Animal class
		//with Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
			for(Animal animal: animals) {
				animal.makeNoise();
				animal.eat();
				animal.walk();
				System.out.println("========================================");
			}
		}
}
