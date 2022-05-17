package com.Day2;

public class Score {
	public static void main(String[] args) {
		int total_run = 20;
		int run_by_ball = 4;
		switch(run_by_ball){
			case 1: total_run += 1;
			break;
			case 2: total_run += 2;
			break;
			case 3: total_run += 3;
			break;
			case 4: total_run += 4;
			break;
			case 6: total_run += 6;
			break;
			default:
			break;
		}
		System.out.println(total_run);
	}
}
