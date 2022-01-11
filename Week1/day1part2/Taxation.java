package com.week1.day1part2;

public class Taxation {
	static double calTax(int gp) {
		if(gp<=240)
			return 0.0;
		else if(gp<=480)
			return (gp*0.15);
		else
			return (gp*0.28);
	}

}
