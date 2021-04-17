package com.class03;

public class EvenOdd {

	public static void main(String[] args) {

		int num = 0;
		if (num%2==0) {
			System.out.println(num+" is an odd number");
		}else {
			System.out.println(num+" is an even number");
		}
		
		int num1 = -10;
		if (num1 > 0) {
			System.out.println(num1+" is a positive number");
		} else if (num1==0) {
			System.out.println(num1+" is a 0");
		}else {
			System.out.println(num1+" is a negative number");
		}
		
	}

}
