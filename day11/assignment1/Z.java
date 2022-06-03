package com.assignment1;

public interface Z extends X,Y{

	@Override
	default void method2() {
		X.super.method2();
	}
	abstract void method4();
	
}
