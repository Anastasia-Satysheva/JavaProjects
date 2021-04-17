package com.class08;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		String answer;
		Scanner scan;
		scan = new Scanner (System.in);
		
		do {System.out.println("Do u want to apply for a CC?");
		answer= scan.next();}
		while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Ok, no more questions.");
}
}
