package com.class07;

import java.util.Scanner;

public class Proj {

	public static void main(String[] args) {
			   Scanner scan;
			   String word1, word2, Output;
			   int int1,int2;

			scan = new Scanner(System.in);

			int1 = scan.nextInt();
			int2 = scan.nextInt();
			word1 = scan.next();
			word2 = scan.next();
			if (int1 == int2 && word1.equals(word2)) {
			  Output = "AND";
			} else if (int1 == int2 || word1.equals(word2)) {
			  Output = "OR";
			}else{
			  Output = "NONE";
			}
			System.out.println(Output);
			 }
			}

