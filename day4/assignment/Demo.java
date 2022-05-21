package com.assignment;

public class Demo {

	public Demo() {
		this("Tuhin");
		System.out.println("Empty Demo()");
	}
	public Demo(String s) {
		this(11);
		System.out.println("Demo(String s) : " + s);
	}
	public Demo(int i) {
		this(11.10f);
		System.out.println("Demo(int i) : " + i);
	}
    public Demo(float f) {
    	System.out.println("Demo(float f) : " + f);
	}
    
    
	public static void main(String[] args) {
		new Demo();
	}
}
