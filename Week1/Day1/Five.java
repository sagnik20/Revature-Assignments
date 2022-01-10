package com.week1.languagebasics;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		Integer n = sc.nextInt();
		for(Integer i=1; i<21; i++) {
			System.out.println(i + " * " + n + " = " + i*n);
		}

	}

}
