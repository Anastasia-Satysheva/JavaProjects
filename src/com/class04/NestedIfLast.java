package com.class04;

public class NestedIfLast {

	public static void main(String[] args) {
		// must be 18 yo otherwise -you cannot
		// weight >110p - if less - cant

		boolean age = true;
		int weight = 200;

		System.out.println("Hey! How old are you? Are you 18 yet?");
		if (age) {
			if (weight > 110) {
				System.out.println("Awesome, lets go for it.");
			} else {
				System.out.println("Ohh your weight is not ok!");

			}

		} else {
			System.out.println("Sorry, you are not old enough");

		}

	}

}