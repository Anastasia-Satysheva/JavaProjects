package com.class07;

public class ForLoop {

	public static void main(String[] args) {
	for (int i=1; i<=100; i++) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	
	for (int i=100; i>=1; i--) {
	System.out.print(i+" ");
}
	
	System.out.println();
	
	for (int i=20; i>=1; i-=2) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	
	for (int i=20; i>=1; i--) {
		if (i%2==0) {
			System.out.print(i+ " ");
		}
	}
	
System.out.println();

for (int i=21; i<=50; i+=2) {
	System.out.print(i+" ");
}

System.out.println();

	for (int i=20; i<=50; i++) {
		if (i%2!=0) {
			System.out.print(i+" ");
		}
	}
	
	System.out.println();
	
	int result = 0;
	for (int i = 1; i<=50; i+=2) {
		result = result+i;
		}
	System.out.println(result);
	
	
	
	int sum = 0;
	for (int i = 0; i<=50; i+=2) {
			sum = sum+i;
	}
	System.out.println(sum);
	
	
	int odd = 0;
	int even = 0;
	for (int i =1; i<=50; i++) {
		if(i%2==0) {
			even+=i;
		}else {
			odd+=i;
		}
	}
	System.out.println(odd);
	System.out.println(even);
	
	}
}
