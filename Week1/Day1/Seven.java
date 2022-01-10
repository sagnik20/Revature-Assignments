//7.	Write a Java Program  to find the biggest, smallest, second biggest, second smallest from a given array of 10 integers

package com.week1.languagebasics;

public class Seven {
	public static void main(String[] args) {
		Integer ar[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		Integer count = ar.length,temp;
		
		for(Integer i=0; i<count; i++) 
			for(Integer j=i+1; j<count; j++)
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
		
		System.out.println("Smallest: "+ar[0]);
	    System.out.println("Largest: "+ar[count-1]);
	    System.out.println("Second Smallest: "+ar[1]);
	    System.out.println("Second Largest: "+ar[count-2]);
	}

}
