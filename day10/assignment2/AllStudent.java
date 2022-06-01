package com.assignment2;

import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ScienceStudent ss = new ScienceStudent();
		
		System.out.println("Enter Name (Science Student)");
		ss.setName(sc.next());
		System.out.println("Enter Address (Science Student)");
		ss.setAddress(sc.next());
		System.out.println("Enter Mathematics Marks");
		ss.setMathsMarks(sc.nextInt());
		System.out.println("Enter Chemistry Marks");
		ss.setChemistryMarks(sc.nextInt());
		System.out.println("Enter Physics Marks");
		ss.setPhisicsMarks(sc.nextInt());
		
		HistoryStudent hs = new HistoryStudent();
		
		System.out.println("Enter Name (History Student)");
		hs.setName(sc.next());
		System.out.println("Enter Address (History Student)");
		hs.setAddress(sc.next());
		System.out.println("Enter History Marks");
		hs.setHistoryMarks(sc.nextInt());
		System.out.println("Enter Civics Marks");
		hs.setCivicsMarks(sc.nextInt());
		
		System.out.println("Your Science Student Details"+ "\n" + "Name :" + ss.getName() + "\n"+"Address :"+ss.getAddress()
		+ "\n"+"Mathematics :" +ss.getMathsMarks() + "\n" + "Physics :" + ss.getPhisicsMarks() + "\n" + "Chemistry :"+ss.getChemistryMarks()
		+ "\n"+ "Overall Percentage :" + ss.getPercentage());
		
		System.out.println("===================================================================>>>>>>>>>>>>");
		
		System.out.println("Your History Student Details"+ "\n" + "Name :" + hs.getName() + "\n"+"Address :"+hs.getAddress()
		+ "\n"+"History :" +hs.getHistoryMarks() + "\n" + "Civics :" + hs.getCivicsMarks()
		+ "\n"+ "Overall Percentage :" + hs.getPercentage());
	}
}
