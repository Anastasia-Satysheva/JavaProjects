package com.class06;

import java.util.Scanner;

public class LogicRecap {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int time;
	String timeOfDay;
	
	System.out.println("What time is it now?");
	time = scan.nextInt();
	if(time<=11 && time>=1) {
		timeOfDay = "morning";
	} else if (time<=13 && time>=12) {
		timeOfDay = "noon";
	} else if(time<=17 && time>=14) {
		timeOfDay = "afternoon";
	} else if(time<21 && time>18) {
		timeOfDay = "evening";
	} else if(time<24 && time>22) {
		timeOfDay = "night";
	} else {
		timeOfDay = "invalid";
	}
System.out.println("Right now is "+timeOfDay);
}
}
