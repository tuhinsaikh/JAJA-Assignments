package com.assignment3;

public class OLA {
  public Car bookCar(int numberOfPassenger, int numberOfKMs) {
	  if(numberOfPassenger<=3) {
		  HatchBack h1 = new HatchBack();
		  return h1;
	  }else {
		  Sedan s1 = new Sedan();
		  return s1;
	  }
		  
  }
  public int calculateBill(Car car) {
	  int total_fare =car.numberOfKms*car.farePerKm;
	  return total_fare;
  }
}

