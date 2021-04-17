package com.class11;

import java.util.Scanner;

public class sum {


			public static void main(String[] args) {
				double sum=0;
				Scanner scan;
			
				scan = new Scanner(System.in);
				System.out.println("How many  elements do u want?");
				int size=scan.nextInt();
				double[]a = new double [size];
				
				
				for (int i=0; i<size; i++) {
					a[i]=scan.nextDouble();
					sum+=a[i];
					
				}
				
				
				for (double num:a) {
					sum+=num;
				}
			System.out.println("The sum of "+size+" elements from an array ="+sum);
		}
			}
