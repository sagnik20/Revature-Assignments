/**
 * 
 */
package com.revature.dsa;

import java.util.Scanner;

/**
 * @author Sagnik
 *
 */
public class string1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st[] = new String[5];
		System.out.println("Enter your names: ");
		for(int i=0;i<5;i++) {
			st[i] = sc.nextLine();
		}
		for(int i=0;i<5;i++) {
			System.out.println("String no: " + (i+1));
			System.out.println(st[i]);
		}
		

	}

}
