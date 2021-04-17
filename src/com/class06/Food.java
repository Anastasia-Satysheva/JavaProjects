package com.class06;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
	Scanner input;
	String country, food;

	input = new Scanner(System.in);
	System.out.println("Enter the country");
	country = input.next();
	switch(country.toUpperCase()) {
	case "Russia":
		food = "Borsch";
		break;
	case "USA":
		food = "Burger";
		break;
	case "Ukraine":
		food = "Salo";
		break;
	default:
		food = "Invalid";
	}
	System.out.println("Food of "+country+ " = "+food);
	
	
	}
}
