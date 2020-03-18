package com.syntax.class05;

public class Recap2 {
	public static void main(String[] args) {
		int hour = 16;
		String timeOfDay;
		if (hour >= 1 && hour <= 11) {
			timeOfDay = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			timeOfDay = "Afternoon";

		} else if (hour >= 16 && hour <= 20) {
			timeOfDay = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			timeOfDay = "Night";

		} else {
			timeOfDay = "Unknown";
		}

		if (!timeOfDay.equals("unknown")) {// Not=! (! means not in Java)
			System.out.println("Right now is " + timeOfDay);
		}
	}
}// when compiler gives you error saying variable needs to insialized
//the default value of int=0, double=0.0, boolean=false, string=null
// *** we use the loop to execute a block of code multiple times.

