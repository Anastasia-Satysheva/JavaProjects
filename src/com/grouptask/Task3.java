package com.grouptask;

import java.util.Scanner;


// Create a 2D array or integer type where you will store integer values in 3 rows and 4 columns. Develop a program which will calculate the sum of  even and odd numbers for that array.
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		int rows = 3;
		int columns = 4;


		
		// Initialized evenSum to keep track of the sum of even numbers
		int evenSum = 0;
		
		// Initialized oddSum to keep track of the sum of odd numbers
		int oddSum = 0;

		
		// Declared 2D array with 3 rows and 4 columns

		int twoDV2[][] = new int[rows][columns];

		// For each row 

		for (int i = 0; i < rows; i++) {
			
			// For each column 

			for (int j = 0; j < columns; j++) {
				// Element is added in the the array
				twoDV2[i][j] = sc.nextInt();
			}
		}

		
		//  iterating rows and columns
		for (int[] x : twoDV2) {
			for (int y : x) {
				// if number is even add it to evenSum
				if (y % 2 == 0) {
					evenSum += y;
				} else {
					// if number is odd add it to oddSum
					oddSum += y;

				}
			}
			System.out.println();
		}

		System.out.println("Even sum " + evenSum);
		System.out.println("Odd sum " + oddSum);

		System.out.println();

		sc.close();
	}

}
