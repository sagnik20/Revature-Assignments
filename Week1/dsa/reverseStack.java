/**
 * 
 */
package com.revature.dsa;

import java.util.Stack;
import java.util.Scanner;

/**
 * @author Sagnik
 *
 */
public class reverseStack {

	/**
	 * @param args
	 */
	
	public static <T> void reverse(Stack<T> stk) {
		
		if(stk.isEmpty())
			return;
		
		T lst = poplst(stk);
		
		reverse(stk);
		
		stk.push(lst);
	}
	
	public static <T> T poplst(Stack<T> stk) {
		T t = stk.pop();
		//System.out.println("Inside poplst-> element popped : "+t);
		//System.out.println("Stack currently in poplst: "+ stk);
		if(stk.isEmpty())
			return t;
		else {
			T lst = poplst(stk);
			//System.out.println("Stack currently before push in poplst: "+ stk);
			stk.push(t);
			//System.out.println("Stack currently after push in poplst: "+ stk);
			//System.out.println("Inside poplst-> lst element : "+lst);
			return lst;
		}
	}
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ (i+1) +" value");
			s1.push(sc.nextInt());
			System.out.println("After "+(i+1)+" element: Stack -> "+ s1);
		}
		
		System.out.println("Stack before reversal -> "+ s1);
		
		reverse(s1);
		
		System.out.println("Stack after reversal -> "+ s1);
		
		

	}

}
