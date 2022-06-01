package com.assignment4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int rec_area = (length*breadth);
		return rec_area;
	}

	@Override
	public int squareArea(int side) {
		int squ_area = (side*side);
		return squ_area;
	}

	@Override
	public int circleArea(int radius) {
		int cur_area = ((int)3.14*radius*radius);
		return cur_area;
	}

}
