package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String month; 
	String season;
	System.out.println("Please, enter your month");
	month = scan.nextLine();
	if (month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("December")) {
		season= "winter";
	}else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
		season="spring";
	}else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
		season="summer";
	}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
		season="fall";
	}else {
		season="try again";
	}
	System.out.println("You was born in "+ season);
	}
}
