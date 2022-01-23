package com.week1.exceptions;

public class ArrayIndex {

	public static void main(String[] args) {
		String[] arr = {"Rohit","Shikar","Virat","Dhoni"};
		for(int i=0;i<=arr.length;i++)
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Array Index Out of Bounds Exception is caught here!!");
			}
	}

}
