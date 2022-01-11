package com.week1.day1part2;

public class MultiplicationTable {
	static void  displayMultiplicationMatrix() {
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				if(i==0 && j==0)
					System.out.print("    | ");
				else if(i==0 && j>0) {
					if(j<10)
						System.out.print("00"+j+" | ");
					else
						System.out.print("0"+j+" | ");
				}
				else if(j==0 && i>0) {
					if(i<10)
						System.out.print("00"+i+" | ");
					else
						System.out.print("0"+i+" | ");
				}
				else {
					if(i*j<10)
						System.out.print("00"+i*j + " | ");
					else if(i*j<100)
						System.out.print("0"+i*j + " | ");
					else
						System.out.print(i*j + " | ");
				}
			}
			System.out.println();
			dash();
		}
	}
	
	static void dash() {
		for(int i=0;i<78;i++)
			System.out.print("_");
		System.out.println();
	}
	
	public static void main(String[] args) {
		displayMultiplicationMatrix();
	}

}
