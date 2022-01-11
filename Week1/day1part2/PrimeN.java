package com.week1.day1part2;

public class PrimeN {
	
	static int prime_num(int num) {
		int count=0;
		for(int i=2;i<num;i++) 
			if(isPrime(i))
				count++;
		return count;
	}
	static boolean isPrime(int i) {
		if(i==2)return true;
		for(int j=2; j<=Math.sqrt(i); j++)
			if(i%j==0)
				return false;
		return true;
	}

}
