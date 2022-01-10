package com.week1.languagebasics;

public class Six {

	public static void main(String[] args) {
		for(Integer i=1; i<=100; i++) {
			if(checkPrime(i))
				System.out.print(i+" ");
		}

	}
	
	public static Boolean checkPrime(Integer n) {
		if(n<=1)
			return false;
		Integer k=(int) Math.sqrt(n);
		for(Integer i=2; i<=k; i++)
			if(n%i==0)
				return false;
		return true;
	}

}
