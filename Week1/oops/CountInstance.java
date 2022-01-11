package com.week1.oops;

// program to count the numbers of instances created for a class

public class CountInstance {
	
	static Integer count=0;
	
	{
		count +=1;
	}
	
	CountInstance(int a){
		
	}
	CountInstance(int a, String b){
		
	}
	CountInstance(String c){
		
	}

	CountInstance() {
		
	}
	public static void main(String[] args) {
		CountInstance ob1 = new CountInstance();
		CountInstance ob2 = new CountInstance(5);
		CountInstance ob3 = new CountInstance(3,"abc");
		CountInstance ob4 = new CountInstance("xyz");
		
		System.out.println(CountInstance.count);
		

	}

}
