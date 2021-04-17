package com.class05;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int quiz;
	int midTerm;
	int finalScores;
	String grade;
	System.out.println("Please enter your quiz score");
	quiz = scan.nextInt();
	System.out.println("Please enter your midterm score");
	midTerm = scan.nextInt();
	System.out.println("Please enter your final scores");
	finalScores = scan.nextInt();
	if ((quiz+midTerm+finalScores)/3>=90) {
		grade="A";
	}else if(((quiz+midTerm+finalScores)/3<=90) && ((quiz+midTerm+finalScores)/3>=70) ){
		grade="B";
	}else if (((quiz+midTerm+finalScores)/3<70) && ((quiz+midTerm+finalScores)/3>=50) ){
		grade="C";
	}else if ((quiz+midTerm+finalScores)/3<50){
		grade="F";
		
		System.out.println("Your score is "+grade);
	}}
}

