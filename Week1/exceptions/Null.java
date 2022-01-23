package com.week1.exceptions;

public class Null {
	public static void main(String[] args) {
		Null ob = null;
		try {
			ob.hashCode();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Throws a Null Pointer Exception");
		}
	}

}
