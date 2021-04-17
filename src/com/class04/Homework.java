package com.class04;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//loan programm
		
	int loan = 200009;
	
	System.out.println("Hey! What amount do u need?");
	if (loan<=0) {
		System.out.println("Are u crazy?");
	} else if (loan<=200000) {
		System.out.println("Here u go");
	} else {
		System.out.println("Sorry, too much. I have to reject u.");
	}
	
	
	
	// DMV
	
	int age = 18;
	
	System.out.println("Hey! How old are u?");
	if (age>=18) {
		System.out.println("Awesome. here's your license!");
	} else {
		System.out.println("Sorry, you need to  learn. Here's your learner's permit");
	}
	
	// Temperature


	Scanner scan= new Scanner (System.in);
	System.out.println("Please, enter city!");
	String city=scan.nextLine();
	System.out.println(city);


	System.out.println("Please, print Celsious temperature");
	int temp=scan.nextInt();
	System.out.println("The temperature in "+city+" = "+((temp*1.8)+32));


	
	
	
	
	
	}

}




