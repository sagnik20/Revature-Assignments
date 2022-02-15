/**
 * 
 */
package com.revature.dsa;

import java.util.Scanner;

/**
 * @author sagni
 *
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int k = 0;
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; ++i, k = 0) {
		      for (int j = 1; j <= rows - i; j++) {
		         System.out.print("  ");
		      }
		      while (k != 2 * i - 1) {
		    	  System.out.print("* ");
		         k++;
		      }
		      System.out.println();
		}

	}

}
