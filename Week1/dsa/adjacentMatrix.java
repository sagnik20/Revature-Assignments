/**
 * 2) Print all the adjancent Elements



Input: Rows = 3, Cols = 3
(Takes only Unquie values)
0 1 2
0 3 4 5
1 7 8 9
2 15 22 33



Enter the number to find adjancents : 33
8,9,22



4
3,7,8,9,5



8
3,4,5, 7,8,15,22,33

 */
package com.revature.dsa;

import java.util.Scanner;

/**
 * @author Sagnik
 *
 */
public class adjacentMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[3][3];
		
		System.out.println("Enter the Row: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the Column: ");
		int col = sc.nextInt();
		
		System.out.println("Enter the matrix");
		
		//taking matrix as input
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the number to search :");
		Integer n = sc.nextInt();
		
		System.out.println("Your array :");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		
		int a = adjacent(mat,n,row,col);
		if(a==-1) {
			System.out.println("Element not Present");
		}
		

	}
	
	static int adjacent(int m[][],int n,int row,int col) {
		
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(m[i][j]==n) {
					System.out.println("Adjacent element! ");
					if((i-1>-1)) {
						System.out.print(m[i-1][j] + " ");
						if(j-1>-1) {
							System.out.print(m[i-1][j-1] + " ");
						}
						if(j+1  < col) {
							System.out.print(m[i-1][j+1] + " ");
						}
					}
					if((i+1<row)) {
						System.out.print(m[i+1][j] + " ");
						if(j-1>-1) {
							System.out.print(m[i+1][j-1] + " ");
						}
						if(j+1  < col) {
							System.out.print(m[i+1][j+1] + " ");
						}
					}
					if(j-1>-1) {
						System.out.print(m[i][j-1] + " ");
					}
					if(j+1  < col) {
						System.out.print(m[i][j+1] + " ");
					}
					
					return 0;
				}
			}
		}
		
		return -1;
	}

}
