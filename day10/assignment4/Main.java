package com.assignment4;

public class Main {

	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		int curcle_area = a1.circleArea(8);
		System.out.println(curcle_area);
		
		int rectanguler_area = a1.rectangleArea(20,10);
		System.out.println(rectanguler_area);
		
		int squere_area = a1.squareArea(8);
		System.out.println(squere_area);
	}
}
