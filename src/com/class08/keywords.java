package com.class08;

public class keywords {

	public static void main(String[] args) {
		boolean rain=true;
		int temp=60;
		while(rain) {
			System.out.println("I will stay home");
			if (temp>75) {
				System.out.println("I will walk under warm rain");
			break;
			}
			temp+=2;
		}

		for(int i=1; i<=10; i++) {
			System.out.println("Hello!");
			if (i==5) {
			break;
		}
		
		
	}

}
}