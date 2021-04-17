package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		String add = "addition of 2 numbers ";
		String sub = "substraction of 2 numbers ";
		String mult = "multiplication of 2 numbers ";
		String div = "division of 2 numbers ";

		double num3 = 11.99;
		double num4 = 12.99;
		double num5 = 3.9;

		double add1 = num3 + num4;
		double sub1 = num3 - num4;
		double mult1 = num3 * num4;
		double div1 = num3 / num4;
		double square1 = num5 * num5;

		System.out.println("The " + add + num3 + " and " + num4 + " is equal " + add1 + ".");
		System.out.println("The " + sub + num3 + " and " + num4 + "is equal " + sub1 + ".");

		System.out.println("The square of the " + num5 + " is " + square1 + ".");

		int width = 5;
		int height = 8;
		int perimeter = (width + height)*2;
		
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width of " + width + " and height of " + height + " is equal to " + perimeter + " and the area is equal to "
		+ area + ".");
		
		
		int mod=10%3;
		System.out.println(mod);
	}

}
