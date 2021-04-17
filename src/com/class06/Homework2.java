package com.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
Scanner input;
char Grade;
String Explanation;
System.out.println("Please, provide grade.");
input = new Scanner (System.in);
Grade = input.next().charAt(0);
switch(Grade) {
case 'A':
	Explanation = "Excellent";
	break;
case 'B':
	Explanation = "Good";
	break;
case 'C':
	Explanation = "Average";
	break;
default: 
	Explanation ="Not Acceptable";
}
System.out.println("your grade "+Grade+" is "+Explanation);
	}

}
