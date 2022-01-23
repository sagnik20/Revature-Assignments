package com.week1.exceptions;

public class Arithmatic {

	public static void main(String[] args) {
		int first = 20;
		int second = 20%2;
		
		try {
			int div = first/second;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Arithmatic Exception is caught here!!");
		}

	}

}
