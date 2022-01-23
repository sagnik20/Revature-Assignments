/*
 * Problem Statement 2:

Given a matrix mat[][] having n rows and m columns. We need to find unique elements in matrix i.e, those elements which are not repeated in the matrix or those elements whose frequency is 1. 
Examples: 
Input :  20  15  30  2
         2   3   5   30
         6   7   6   8
Output : 3  20  5  7  8  15 

Input :  1  2  3  
         5  6  2
         1  3  5
         6  2  2
Output : No unique element in the matrix
Follow these steps to find unique element: 
1. Create an empty hash table or dictionary. 
2. Traverse through all the elements of the matrix 
3. If element is present in the dictionary, then increment its count 
4. Otherwise insert element with value = 1. 

 */

package com.revature.dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Matrix {

	public static void main(String[] args) {
		Integer m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		Set<Integer> b = new HashSet<>();
		Set<Integer> identical = new HashSet<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				Integer a=sc.nextInt();
				if(identical.contains(a)) {
					identical.remove(a);
					b.add(a);
				}
				else if(!b.contains(a))
					identical.add(a);
			}
		}
		System.out.println(identical);

	}

}
