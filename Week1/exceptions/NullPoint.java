package com.week1.exceptions;

public class NullPoint {

	public static void main(String[] args) {
		NullPoint ref = null;
	    try {
			ref.toString();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Null Pointer Exception is thrown here!!");
		}

	}

}
