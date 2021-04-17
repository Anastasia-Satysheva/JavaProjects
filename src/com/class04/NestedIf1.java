package com.class04;

public class NestedIf1 {
public static void main(String[] args) {
	boolean morning = false;
	boolean todayClass = false;
	
	if (morning) {
		System.out.println("Good M!");
	} else {
		System.out.println("Mm its evening.. Do you have class then?");
		if (todayClass) {
			System.out.println ("Good luck at class!");
		} else {
			System.out.println("Lets go for a dinner then.");
		}
	}
	// if morning - gm , if evening - if i have class
}
}
