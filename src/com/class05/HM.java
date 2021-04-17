package com.class05;

import java.util.Scanner;

public class HM {
public static void main(String[] args) {
	
	double num1;
	double num2;
	double num3;
	double largest;
	Scanner scan = new Scanner(System.in);
	System.out.println("Please, provide 3 numbers");
	
	num1=scan.nextDouble();
	num2=scan.nextDouble();
	num3=scan.nextDouble();
	
	
	
	if (num1==num2 && num1==num3) {
		System.out.println("Numbers are equal");
	}else {
	if (num1 > num2) {
		if(num1>num3) {
			largest = num1;
		} else {
		largest = num3;
	}
	} else {
		if (num2>num3) {
			largest = num2;
	}
	 else {
			largest = num3;
		} 
	} System.out.println("The largest number is "+largest);
}
}
}