package com.week1.day1part2;

public class Movie {
	
	static float calculateProfit(int numAttendees) {
		return (float) ((5 * numAttendees) - (20 + (0.5 * numAttendees)));
	}

}
