package com.week1.day1part2;

public class MaxofThree {
	
	static int calMax(int x, int y, int z) {
		if(x>y)
			if(x>z)
				return x;
			else
				return z;
		else
			if(y>z)
				return y;
			else
				return z;
	}

}
