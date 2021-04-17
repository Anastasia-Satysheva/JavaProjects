package com.grouptask;

public class Task5 {

	//Write a program to swap 2 numbers without a temporary variable?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;

		System.out.println("Before swaping:" + " x = " + x + ", y = " + y);

		// Code to swap 'x' and 'y'
		x = x + y; // x now becomes 8
		y = x - y; // y becomes 3
		x = x - y; // x becomes 5

		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
		System.out.println();

	}

}
