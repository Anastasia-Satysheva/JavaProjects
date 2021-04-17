package com.grouptask;

public class Task4 {
	
	//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries. Then print all values from that array using 2 different loops and calculate how many total countries have been stored.

	public static void main(String[] args) {

		// Initialized continent wise countries in 2D array
		String[][] states = { { "USA", "Canada" }, { "Brazil", "Mexico", "Chile" }, { "Italy", "France" },
				{ "India", "Iran", "Thailand" }, { "Kenya", "Namibia", "Egypt" } };

		// Initialized count to keep track of the count of countries
		int count = 0;

		for (String[] x : states) {
			for (String y : x) {
				System.out.print(y + "   ");
				count++; // counting the countries
			}
			System.out.println();
		}

		// total countries are printed
		System.out.println("Total number of countries: " + count);

	}
}
