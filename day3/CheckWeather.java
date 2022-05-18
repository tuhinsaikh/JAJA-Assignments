package com.assignments;

public class CheckWeather {
	
	void plan(boolean isSnowing, boolean isRaining, double temperature) {
			String result = isSnowing | isRaining | temperature>50 ? "Let’s stay home." : "Let’s go out!" ;
			
			System.out.println(result);
		}

	public static void main(String[] args) {
		
		CheckWeather cw = new CheckWeather();	

	//Assume these can have any value:
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	
	//print "Let’s stay home." if its raining, snowing or
	//below 50 degrees and print "Let’s go out!" otherwise.
	
	cw.plan(isSnowing, isRaining, temperature);

 }
}
