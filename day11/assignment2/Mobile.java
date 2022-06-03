package com.assignment2;

public class Mobile {
	String note4;
	String note5;
	String note6;
	String note7;
	
	void searchOutdatedModel(String model, String company) {
		if(model.equals("note4")) {
			System.out.println(model+"_OUTDATED");
		}
		if(model.equals("note5")) {
			System.out.println(model+"_OUTDATED");
		}
		if(model.equals("note6")) {
			System.out.println(model+"_OUTDATED");
		}
		if(model.equals("note7")) {
			System.out.println(model+"_OUTDATED");
		}
	}
	void searchOutdatedModel(String company) {
		if(company.equals("Mi") || company.equals("Xaomi")) {
			System.out.println("note4"+"_OUTDATED");
			System.out.println("note5"+"_OUTDATED");
			System.out.println("note6"+"_OUTDATED");
			System.out.println("note7"+"_OUTDATED");
		}
		
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.searchOutdatedModel("note4", "Mi");
		m.searchOutdatedModel("Xaomi");
	}
}
