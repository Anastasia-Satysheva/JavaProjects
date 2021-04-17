package com.class08;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first number");
	int start = scan.nextInt();
	System.out.println("Enter last number");
	int end = scan.nextInt();
	int sumOdd = 0;
	int sumEven = 0;
	if (start<end) {
		for (int i = start; i<=end; i++) {
			if(i%2==0){
				sumOdd +=i;
			} else {
				sumEven +=i;
			}
		}
		System.out.println(sumOdd+" "+sumEven);
	}else {
		System.out.println("wrong");
	}
}
}
