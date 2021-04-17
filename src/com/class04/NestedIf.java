package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean morning = false;
		boolean classToday = false;

//is it morning -GM
// if there's class - GM classmates, if not - hello my family

		if (morning) {
			System.out.println("let me check if i have a class");
			if (classToday) {
				System.out.println("Hello, classmates!");
			} else {
				System.out.println("Hello, my family");
			}

		} else {
			System.out.println("the end");
		}

		boolean anyAllergy = false;
		boolean pollenAllergy = true;

		if (anyAllergy) {
			System.out.println("Let check what allergy you have");
			if (pollenAllergy) {
				System.out.println("That sucks! Stay home!");
			} else {
				System.out.println("different type..");
			}
		} else {
			System.out.println("You are lucky!");
		}

		// if its friday - going to movie, if not - home, if friday 13th scary movie, if
		// not -any movie

		boolean friday = false;
		int day = 1;

		if (friday) {
			System.out.println("Yay! We are going to the movie!");
			if (day == 13) {
				System.out.println("Mmmmm.. Time for a scary movie!");
			} else {
				System.out.println("Hmm Romantic then.");
			}
		} else {
			System.out.println("Staying home and studying...");
		}

		// if completed assignmnet what score you got , we will send a message 2 >
		// 50else he didnt completed it

		boolean completion = false;
		int score = -10;
		if (completion) {
			System.out.println("Awesome! What's your score?");
			if (score >= 50) {
				System.out.println("Wow, its a great job!");
			} else if (score < 0) {
					System.out.println("you cheated!");
				} else {
					System.out.println("You can do better.");
				}
			} else {
			System.out.println("Please, complete the assignment!");
		}

	}
}
