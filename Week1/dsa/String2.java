/**
 * 
 */
package com.revature.dsa;

import java.util.Scanner;

/**
 * @author sagni
 *
 */
public class String2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count");
		int r = sc.nextInt();
		System.out.println("Enter the col count");
		int c = sc.nextInt();
		int rc = r*c;
		if(r<c)
			rc-=r;
		else if(c<r)
			rc-=c;
		else
			rc-=r;
		//System.out.println(rc);
		sc.nextLine();
		System.out.println("Enter the String");
		String a = sc.nextLine();
		int al = a.length();
		//System.out.println(al);
		
		if(rc==al)
			System.out.println(0);
		if(rc<al) {
			System.out.println("-"+(al-rc));
		}
		if(rc>al) {
			System.out.println("+"+(rc-al));
		}
	}

}
