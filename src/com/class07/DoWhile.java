package com.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	int Number;
	Scanner scan;
	scan = new Scanner(System.in);
	do {
		System.out.println("Please enter the number");
		Number = scan.nextInt();
	}while (Number!=17); 
	
		System.out.println("Great job!");
	
	
	for (int i=5; i>=50; i+=50){
		System.out.println(i+" ");
	}
	}

}       
