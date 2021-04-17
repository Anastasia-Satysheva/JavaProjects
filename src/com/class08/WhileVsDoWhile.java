package com.class08;

import java.util.Scanner;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		Scanner scan;
		int money;
		
		
		scan = new Scanner(System.in);
		System.out.println("Please, pay for a soda.");
		
		 do {
			 money = scan.nextInt();
			if(money>3) {
				System.out.println("Please, give us less money");
			}else if(money<3) {
				System.out.println("Please, give us more money.");
			}
		}while (money!=3);
		System.out.println("Thank u for your purchase!");
		
		
		
		
		int price;
		System.out.println("Please, pay for a soda");
		price = scan.nextInt();
		while(price!=3) {
			if(price>3) {
				System.out.println("Give us less money.");
			}else if(price<3) {
				System.out.println("Give us more money");
			}
			price = scan.nextInt();
		}
		System.out.println("Thank you for your purchase.");
	}

}
