package com.grouptask;

public class Task9 {

	
	// Write a java program to find the second largest number in the array?
	public static void main(String[] args) {

		int a[] = { 44, 66, 99, 77, 33, 22, 55 };

		int second;

		// There should be at least two elements
		if (a.length < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int largest = second = Integer.MIN_VALUE;

		// Find the largest element
		for (int i = 0; i < a.length; i++) {
			largest = Math.max(largest, a[i]);
		}

		// Find the second largest element
		for (int i = 0; i < a.length; i++) {
			if (a[i] != largest)
				second = Math.max(second, a[i]);
		}
		if (second == Integer.MIN_VALUE)
			System.out.printf("There is no second " + "largest element\n");
		else
			System.out.printf("The second largest " + "element is %d\n", second);

		System.out.println();

	}

}