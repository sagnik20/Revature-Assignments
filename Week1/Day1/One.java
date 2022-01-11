package com.week1.languagebasics;

public class One {

	public static void main(String[] args) {
		Integer a = Integer.valueOf(args[0]);
		Integer b = Integer.valueOf(args[1]);
		Integer c = Integer.valueOf(args[2]);
		
		Integer max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Maximum number is: "+max);

	}

}
