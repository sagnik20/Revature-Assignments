package com.week1.exceptions;

public class UseNegativeNumber {

	public static void main(String[] args) {
		try {
			int a = -999;
			throw new NegativeNumberException();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
