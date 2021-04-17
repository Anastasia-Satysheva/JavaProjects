package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		boolean sale;
		int price;
		double finalPrice;
		Scanner scan;
		String item;
		scan = new Scanner(System.in);
		
		System.out.println("Do we have a sale today?");
		sale = scan.nextBoolean();
if (!sale) {
	System.out.println("We are not going");
} else {
	
	System.out.println("What item you want?");
	item = scan.next();
	System.out.println("Whats the price for it?");
	price = scan.nextInt();
	if (price<10){
		finalPrice = price*0.95;
	} else if (price>=10 && price<100) {
		finalPrice = price*0.9;
	}else if (price>=100 && price<500) {
		finalPrice = price*0.8;
	}else if (price>=500) {
		finalPrice = price*0.7;
	} else {
		finalPrice = 0;
	}
	System.out.println("Item you bought - " + item +", original price was "+ price+ " and final price is "+finalPrice);
}
	}

}
