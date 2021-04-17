package com.class04;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please, enter 1nd numbers");
	int num1=input.nextInt();
	System.out.println("Please, enter 2nd number");
	int num2=input.nextInt();
	if (num1>num2) {
		System.out.println(num1+" > "+num2);
	} else if (num1==num2){
		System.out.println("Numbers are equal");
	} else {
		System.out.println(num2+" > "+num1);
	}
	
	
	
	
}
}
