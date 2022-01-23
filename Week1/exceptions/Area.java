package com.week1.exceptions;
import java.util.Scanner;

public class Area {
	
	void calcArea(int a) {
		System.out.println("Area of square is: "+ (a*a));
		
	}
	
	void calcArea(int a,int b) {
		System.out.println("Area of rectangle is: "+ (a*b));
		
	}
	
	void getDimension() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of the rectangle:");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			this.calcArea(a, b);
			System.out.println("Enter the sides of the square: ");
			this.calcArea(sc.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("This is an Exception!df");
		}
		finally {
			sc.close();
			System.out.println("Within Finally block!!!");
		}
		sc.close();
	}

	public static void main(String[] args) {
		Area ab = new Area();
		ab.getDimension();

	}

}
