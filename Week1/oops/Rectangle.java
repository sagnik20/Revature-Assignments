package com.week1.oops;

import java.util.Scanner;

public class Rectangle {
	Integer length, breadth;

	public Rectangle(Integer length, Integer breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(Integer l) {
		this.length = l;
		this.breadth = l;
	}
	void show() {
		System.out.println("Length : "+ length);
		System.out.println("Breadth: "+ breadth);
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println(" Enter length and Breadth :");
		Integer l=sc.nextInt();
		Integer b = sc.nextInt();
		Rectangle r = new Rectangle(l,b);
		System.out.println("Enter side value:");
		Rectangle r1 = new Rectangle(sc.nextInt());
		r.show();
		r1.show();
		
	}

}
