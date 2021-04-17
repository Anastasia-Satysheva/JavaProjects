package com.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
Scanner input;
String country, language;
System.out.println("Provide country.");
input = new Scanner(System.in);
country = input.next();
switch(country.toUpperCase()) {
case "Russia":
	language = "Russian";
	break;
case "USA":
	language = "English American";
	break;
case "England":
	language = "British English";
	break;
default: language = "Unknown";
}
System.out.println("The language of "+country+" = "+language);
	}

}
