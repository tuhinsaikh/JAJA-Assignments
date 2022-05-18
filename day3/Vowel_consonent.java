package com.assignments;

public class Vowel_consonent {
	

	
	void vowelOrConsonent(char char1) {
		if(char1=='a' | char1=='A' | char1=='e' | char1=='E' | char1=='i' |char1=='I' | char1=='o' | char1=='O' | char1=='u' | char1=='U' ) {
			System.out.println("vowel");
		}else if(char1=='b' | char1=='B' | char1=='c' | char1=='C' | char1=='d' |char1=='D' | char1=='f' | char1=='F' | char1=='g' | char1=='G' | char1=='h' | char1=='H' | char1=='j' | char1=='J' | char1=='k' |char1=='K' | char1=='l' | char1=='L' | char1=='m' | char1=='M'|char1=='n' | char1=='N' | char1=='p' | char1=='P' | char1=='q' |char1=='Q' | char1=='r' | char1=='R' | char1=='s' | char1=='S' |char1=='t' | char1=='T' | char1=='v' | char1=='V' | char1=='w' |char1=='W' | char1=='x' | char1=='X' | char1=='y' | char1=='Y'| char1=='z' | char1=='Z') {
			System.out.println("consonent");
		}else System.out.println("invalid character");
	}
	
	public static void main(String[] args) {
		Vowel_consonent ch = new Vowel_consonent();
		ch.vowelOrConsonent('a');
		ch.vowelOrConsonent('B');
		ch.vowelOrConsonent('%');
		
	}
}
