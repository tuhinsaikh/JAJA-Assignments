package com.evaluation1;
/*
 * Question 1:

Why String is immutable in java and what is the difference between String and String Builder? And Write some
of the methods of String class at least 5 with example.
  Q. Why String is immutable in java?
  ans: In java uses the concept of String Literal. There may be many variables and if one want to change a 
  		particular variable it will be affected by all the variable , that's why String is immutable in java.
  
  Q. what is the difference between String and String Builder?
  ans: String is immutable but if we want to create a mutable variable then we use String Builder.		
 */

public class StringQuestion {
	//Write some of the methods of String class at least 5 with example.
	
	public static void main(String[] args) {
		//1. for length 
		String name = "Tuhin";
		int length = name.length();
		System.out.println(length);
		
		//2. for getting index value
		int index = name.indexOf("u");
		System.out.println(index);
		
		//3. for concating
		String full_name = name.concat(" Saikh");
		System.out.println(full_name);
		
		//4. for string character 
		char ch = name.charAt(0);
		System.out.println(ch);
		
		//5. for substring 
		String sb = name.substring(2);
		System.out.println(sb);
		
	}
}
