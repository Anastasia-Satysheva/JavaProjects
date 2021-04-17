package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		Scanner scan;
		String element;
		String[] array;
		scan = new Scanner(System.in);
		System.out.println("How many  elements do u want?");
		int size=scan.nextInt();
		array = new String[size];
		for (int i=0; i<size; i++) {
			System.out.println("Please, enter a string");
			array[i]=scan.next();
			
		}
for (String str:array) {
	System.out.println(str+" ");
}
	}

}
