package com.grouptask;


//Write a java program to find the second largest number in the array?
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 324, 45, 90, 9808 };
		int i;

		// Initialize first element as maximum
		int max = arr[0];

		// Iterate through all the array elements starting from index 1
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max) // if current element in the array is greater than the current max, update max
				max = arr[i];

		System.out.println("Largest in given array is " + max);
		System.out.println();

		int arr2[] = { 10, 324, 45, 90, 9808 };

		// Initialize first element as minimum
		int min = arr[0];

		// Iterate through all the array elements starting from index 1
		for (i = 1; i < arr2.length; i++)
			if (arr2[i] < min) // if current element in the array is lesser than the current minimum, update
								// minimum
				min = arr2[i];

		System.out.println("Smallest in given array is " + min);
		System.out.println();


	}

}
