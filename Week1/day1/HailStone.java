package com.week1.day1;

import java.util.Scanner;

public class HailStone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 1000 :");
		Integer n = sc.nextInt();
		
		if(n>1000 || n<1) {
			System.out.println("Entered number is out of said range! \n Exiting!!!");
			System.exit(0);
		}
		
		while(n!=0) {
			System.out.print(n + " ");
			if(n%2==0)
				n=n/2;
			else
				n=(n*3)+1;
		}

	}

}
