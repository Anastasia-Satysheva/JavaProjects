package com.grouptask;

import java.util.Scanner;

public class Task2 {
	
	//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the array by iterating rows and columns
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements : ");

		int rows = 3;
		int columns = 4;

		int twoDV1[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoDV1[i][j] = sc.nextInt();
			}
		}

		// Print the array by iterating rows and columns

		System.out.print("Data you entered :");
		for (int[] x : twoDV1) {
			for (int y : x) {
				// print only if even number
				if (y % 2 == 0) {
					System.out.println(y);
				}
			}
			System.out.println();
		}

	}

}
