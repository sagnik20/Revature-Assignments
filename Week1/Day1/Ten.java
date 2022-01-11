package com.week1.languagebasics;
import java.util.Scanner;
public class Ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer n = sc.nextInt();
		Ten ob = new Ten();
		System.out.println("Factorial: "+ ob.fact(n));

	}
	
	Integer fact(Integer n) {
		Integer val = 1;
		if(n<2)
			return 1;
		return n*fact(n-1);
	}

}
