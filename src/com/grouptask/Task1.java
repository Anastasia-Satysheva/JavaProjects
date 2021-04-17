package com.grouptask;

import java.util.Scanner;

public class Task1 {
	
	//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = 3;
		int columns = 3;

		System.out.println("Enter array elements : ");
		
		// Declared 2D array with 3 rows and 3 columns

		int twoD[][] = new int[rows][columns];
		
		// Initialized sum to keep track of the sum of  numbers

		int sum = 0;

		// For each row 
		for (int i = 0; i < rows; i++) {
			// For each column 
			for (int j = 0; j < columns; j++) {
				// Element is added in the the array
				twoD[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("\nData you entered : \n");
		
		
		// Print the array by iterating rows and columns
		for (int[] x : twoD) {
			for (int y : x) {
				System.out.print(y + "        ");
				sum+=y;
			}
			System.out.println();
		}

		System.out.println("Total sum " + sum);

		sc.close();
	}

}