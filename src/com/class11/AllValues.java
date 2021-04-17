package com.class11;

public class AllValues {

	public static void main(String[] args) {
		int[][] numbers = {
				{1,2,3,4},
				{10,20,30,40,50},
				{100,200,300},
				
		};
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length); 

		for (int r=0; r<numbers.length; r++) { //iterates over rows
			
			for (int c=0; c<numbers[r].length; c++) {
				
				System.out.println(numbers[r][c]);
			}
			
			
		}
		
		
		for (int[] array:numbers) {
			for(int a:array) {
				System.out.println(a);
				
			}
			
		}
		
		
		
			}

	}

