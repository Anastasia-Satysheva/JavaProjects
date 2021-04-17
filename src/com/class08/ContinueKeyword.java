package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			
			if (i==5 || i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
System.out.println(   );
		
		for (int i=1; i<=40; i++) {
			if (i%4==0) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		
		
	}

}
