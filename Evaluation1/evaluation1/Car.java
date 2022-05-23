package com.evaluation1;
//Question 3:

public class Car {
	private static Engine Engine;
	String model;
	String companyName;
	String Color;
	Engine engine;
	
	public Car() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String model, String companyName, String color, Engine engine) {
		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.setModel("Harrier");
		c.setCompanyName("Tata");
		c.setColor("black");
		c.engine.manufacturer = "tata";
		c.engine.Power = 110;
		c.engine.rmp = 10000;
		c.engine.hasTurbo = true;
		System.out.println("Car Model : "+c.model);
		System.out.println("Car companyName: "+c.companyName);
		System.out.println("Car color : "+ c.Color);
		System.out.println("Car RPM : "+Engine.rmp);
		System.out.println("Car power : "+Engine.Power);
		System.out.println("Car Engine Manufacture :"+Engine.manufacturer);
		System.out.println("Car Has Turbo : "+Engine.hasTurbo);
		
		
	System.out.println("----------------------------------");	
		
		Car c1 = new Car("Harrier","Tata","black",Engine);
		Engine.manufacturer = "tata";
		Engine.Power = 110;
		Engine.rmp = 10000;
		Engine.hasTurbo = false;
		System.out.println("Car Model : "+c1.model);
		System.out.println("Car companyName: "+c1.companyName);
		System.out.println("Car color : "+ c1.Color);
		System.out.println("Car RPM : "+Engine.rmp);
		System.out.println("Car power : "+Engine.Power);
		System.out.println("Car Engine Manufacture :"+Engine.manufacturer);
		System.out.println("Car Has Turbo : "+Engine.hasTurbo);
	}
}

