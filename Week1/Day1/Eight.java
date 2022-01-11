package com.week1.languagebasics;
import java.util.Scanner;
public class Eight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a[] = {1,3,5,8,9,11,13,15,17,18,21,24,26,29,34,37,39,45};
		System.out.println("Enter a number to search: ");
		Integer n = sc.nextInt();
		Eight ob = new Eight();
		Integer loc = ob.search(a,0,a.length-1,n);
		
		if(loc<0)
			System.out.println("The number is not found");
		else
			System.out.println("The number is found at location "+ loc);
	}
	
	Integer search(Integer a[], Integer left, Integer right, Integer n) {
		if(right>=left) {
			Integer middle = (Integer)(left+right)/2;
			if(n.equals(a[middle])) 
				return middle+1;
			if(n.compareTo(a[middle])>0) 
				return search(a,middle+1,right,n);
			else if(n.compareTo(a[middle])<0)
				return search(a,left,middle-1,n);
		}
		return -1;
	}

}
