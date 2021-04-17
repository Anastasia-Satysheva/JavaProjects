package com.class09;

public class Clock {

	public static void main(String[] args) {
		
			for (int j=0; j<24; j++) {
				
				for (int i=0; i<60; i++) {
					
			
					if (i<10) {
						System.out.println(j+" 0"+i);
					}else {
						System.out.println(j+" "+i);
					}
				}
				
			}
	
	}
}

