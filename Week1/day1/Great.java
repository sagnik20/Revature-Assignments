package com.week1.day1;
import java.util.Scanner;
public class Great {

	public static void main(String[] args) {
		System.out.println("Enter three numbers : ");
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		
		Integer max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Maximum number is: "+max);

	}

}
