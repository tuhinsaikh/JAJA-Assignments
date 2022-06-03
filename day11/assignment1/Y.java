package com.assignment1;

public interface Y {
	abstract void method1();
	default void method2() {
		System.out.println("inside default method2 in Y");
	}
	static void method() {
		System.out.println("inside static method in Y");
	}
}
