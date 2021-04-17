package com.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
	int num1, num2, result;
	Scanner scan;
	char Operator;
	
	scan = new Scanner(System.in);
	System.out.println("Please provide 2 numbers.");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	System.out.println("Please, provide an operator.");
	Operator = scan.next().charAt(0);
	switch (Operator) {
	case '*':
		result = num1*num2;
		break;
	case'-':
		result = num1-num2;
		break;
	case '+':
		result = num1+num2;
		break;
	case '/':
		result = num1/num2;
	default: result = 0;
	}
	if (default) {
		System.out.println(result);
	}
		
		
	}  

}
