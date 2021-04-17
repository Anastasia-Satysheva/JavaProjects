package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		String item;
		int price, money;
		Scanner scan;
		scan = new Scanner(System.in);
		int remainder = 0;
		int sum =0;
		
	System.out.println("Enter the item you want to buy");
	item = scan.next();
	System.out.println("Enter the cost of it");
	price = scan.nextInt();
	
	do {
	System.out.println("Enter money you paying right now");
	money = scan.nextInt();
	sum+=money;
	if (sum<price) {
		
		remainder = price-sum;
		System.out.println("more"+remainder);
	}else if (sum>price) {
		remainder = sum-price;
		System.out.println("too much"+remainder);
		break;
	}else {
		System.out.println("right amount");
		
	}
	}while (price!=sum);
System.out.println("thank you for shopping");
}
}
