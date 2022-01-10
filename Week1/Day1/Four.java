package com.week1.languagebasics;

public class Four {

	public static void main(String[] args) {
		Integer sum = 0;
		for(Integer i=1; i<101; i++) {
			if(i%2==0)
				sum+=i;
		}
		
		System.out.println("The Sum of all even numbers between 1 to 100 : "+ sum);

	}

}
