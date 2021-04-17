package com.class06;

public class SwitchState {

	public static void main(String[] args) {
		int day = 10;
		String weekDay;
		if (day == 1) {
			weekDay = "monday";
		} else if (day == 2) {
			weekDay = "tuesday";
		} else if (day == 3) {
			weekDay = "wednesday";
		} else if (day == 4) {
			weekDay = "thursday";
		} else if (day == 5) {
			weekDay = "friday";
		} else if (day == 6) {
			weekDay = "saturday";
		} else if (day == 7) {
			weekDay = "sunday";
		} else {
			weekDay = "Invalid";
		} 
		
		if(!weekDay.equals("Invalid")) {
			System.out.println("Today is "+weekDay);

	}

	

	String weekDay1;
	switch (day) {
	case 1:
		weekDay1 = "Monday";
		break;
	case 2:
		weekDay1 = "Tuesday";
		break;
	case 3:
		weekDay1 = "Wednesday";
		break;
	case 4:
		weekDay1 = "Thursday";
		break;
	case 5:
		weekDay1 = "Monday";
		break;
	case 6:
		weekDay1 = "Tuesday";
		break;
	case 7:
		weekDay1 = "Monday";
		break;
		default:
			weekDay = "Invalid"
	}
	
	System.out.println("weekDay");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
