package com.week1.languagebasics;
import java.util.Scanner;
public class Nine {
	Integer mat[][]=new Integer[3][3];
	
	void getMatrix() {
		Scanner sc = new Scanner(System.in);
		for(Integer i=0; i<3; i++)
			for(Integer j=0; j<3; j++) 
				this.mat[i][j]=sc.nextInt();
	}
	
	void printMatrix() {
		for(Integer i=0; i<3; i++) {
			for(Integer j=0; j<3; j++) 
				System.out.print(this.mat[i][j] + "  ");
			System.out.println();
		}
	}
	
	Nine addMatrix(Nine a) {
		Nine b = new Nine();
		for(Integer i=0; i<3; i++)
			for(Integer j=0; j<3; j++) 
				b.mat[i][j] = a.mat[i][j]+this.mat[i][j];
		return b;
		
	}
	
	public static void main(String[] args) {
		 Nine first = new Nine();
		 Nine second = new Nine();
		 System.out.println("Enter the first Matrix");
		 first.getMatrix();
		 System.out.println("Enter the second Matrix");
		 second.getMatrix();
		 Nine sum = first.addMatrix(second);
		 System.out.println("First Matrix: ");
		 first.printMatrix();
		 System.out.println("Second Matrix: ");
		 second.printMatrix();
		 System.out.println("Final matrix: ");
		 sum.printMatrix();
	}

}
