package com.assignment3;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium) {
		if(stadium != null){
			if(stadium ==Stadium.EDEN_GARDENS_STADIUM) {
				System.out.println("This is the home ground of KKR");
			}
			if(stadium ==Stadium.M_CHINNASWAMY_STADIUM) {
				System.out.println("This is the home ground of RCB");
			}
			if(stadium ==Stadium.CHIDAMBARAM_STADIUM) {
				System.out.println("This is the home ground of CSK");
			}
			if(stadium ==Stadium.WANKHEDE_STADIUM) {
				System.out.println("This is the home ground of Mumbai Indians");
			}
		}else System.out.println("invalid stadium");
		
	}
	public static void main(String[] args) {
		IPL m = new IPL();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter - EDEN_GARDENS_STADIUM / M_CHINNASWAMY_STADIUM / CHIDAMBARAM_STADIUM / WANKHEDE_STADIUM");
		String s = scanner.next();
		Stadium stadium = Stadium.valueOf(s);
		m.homeTeamStadium(stadium);
	}
		
}
