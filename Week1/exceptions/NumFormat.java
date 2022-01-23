package com.week1.exceptions;

public class NumFormat {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(null);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("throws Number Format Exception as the input string is of illegal format for parsing as it is null.");
		} 

	}

}
