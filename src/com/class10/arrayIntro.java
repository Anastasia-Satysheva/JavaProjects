package com.class10;

public class arrayIntro {

	public static void main(String[] args) {
	int num=10;
	num = 10;
	num=20;
	
	int[] array = new int[5];
	
	array[0]=10;
	array[1]=12;
	array[2]=15;
	array[3]=9;
	array[4]=13;
	System.out.println(array[0]);
	
	
	
	double[] numbers=new double[2];
	numbers[0]=19.01;
	numbers[1]=10.99;
	System.out.println(numbers[0]);
	
	
	
	String[] names=new String[3];
	names[0]="Oprah";
	names[1]="Anna";
	names[2]="Ben";
	int size = names.length;
	System.out.println(size);
	
	
	char [] grades = new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	System.out.println(grades[1]);
	
	char[] grades1 = {'A', 'B', 'C','D','E','F'};
	System.out.println(grades1);
	
	
	
	
	}
	
}
