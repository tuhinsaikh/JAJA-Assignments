package com.assignment1;

public class Main {
	public static void main(String[] args){
		Bird b1 = new Parrot();
		//with this b1 reference call the fly method of Parrot
		b1.fly();
		
		//and after downcasting this b1 reference to the
		//Parrot class object, call the sing method also
		((Parrot) b1).sing();
		
	}
}
