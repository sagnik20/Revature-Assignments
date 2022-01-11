package com.week1.day1part2;

public class Interest {
	
	static double calInterest(int amt) {
		if(amt<=1000)
			return (amt*0.04);
		else if(amt<=5000)
			return (amt*0.045);
		else
			return (amt*0.05);
	}

}
