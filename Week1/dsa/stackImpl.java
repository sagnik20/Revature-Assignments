/**
 * 
 */
package com.revature.dsa;

/**
 * @author Sagnik
 *
 */


import java.util.Stack;
import java.util.Scanner;

public class stackImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<String> s2 = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of first stack (Integer)");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter "+ (i+1) + " element");
			s1.push(sc.nextInt());
			System.out.println("After "+(i+1)+" element: Stack -> "+ s1);
		}
		
		System.out.println("Final Stack 1-> "+ s1);
		
		System.out.println("Enter elements of first stack (String)");
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter "+ (i+1) + " element");
			s2.push(sc.next());
			System.out.println("After "+(i+1)+" element: Stack -> "+ s2);
		}
		
		System.out.println("Final Stack 2-> "+ s2);
		
		System.out.println("Pop from stack 1 -> "+ s1.pop());
		
		System.out.println("Stack 1 Now-> "+ s1);
		
		System.out.println("Pop from stack 1 -> "+ s1.pop());
		
		System.out.println("Stack 1 Now-> "+ s1);
		
		while(!s2.isEmpty()) {
			System.out.println("Pop from stack 2 -> "+ s2.pop());
			System.out.println("Stack 2 Now-> "+ s2);
		}
	}

}
