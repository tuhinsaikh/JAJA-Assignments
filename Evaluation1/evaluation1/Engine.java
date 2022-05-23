package com.evaluation1;
//Question 3:

public class Engine {
	static int rmp;
	static int Power;
	static String manufacturer;
	static Boolean hasTurbo;
	
	static void enavleTurbo(boolean turbo) {
		if(turbo) {
			
			Engine.hasTurbo = true;
		}else {
			
			Engine.hasTurbo = false;
		}
	}
}
