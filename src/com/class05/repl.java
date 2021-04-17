package com.class05;

import java.util.Scanner;

class repl{
	public static void main(String[] args) {
		  System.out.println("Please enter 3 distinct numbers");
		  Scanner scan = new Scanner(System.in);
		  int num1 = scan.nextInt();
		  int num2 = scan.nextInt();
		  int num3 = scan.nextInt();
		  if (num1>num2) {
		    if (num1>num3) {
		      System.out.println("The largest number is "+num1);
		    }
		  } else if(num2>num1) {
		    if (num2>num3) {
		      System.out.println("The largest number is "+num2);
		    } 
		  }else if(num3>num1) {
		    if (num3>num2){
		    System.out.println("The largest number is "+num3);
		  }
		}
		}
		}