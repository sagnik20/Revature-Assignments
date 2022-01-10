package com.week1.languagebasics;

import java.util.Scanner;

public class Three {
	//Palindrome
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: " );
		Integer n = sc.nextInt();
		Integer m = n,rem,sum=0;
		
		while(m!=0) {
			rem = m%10;
			sum = sum*10 + rem;
			m/=10;
		}
		//System.out.println(sum+" "+n);
		if(sum.equals(n))
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
	}

}
