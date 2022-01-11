package com.week1.day1;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		ControlFlow ob = new ControlFlow();
		Scanner sc = new Scanner(System.in);
		
		Integer a;
		
		while(true) {
			System.out.println("Enter 1 to Determine whether a year is leap or not");
			System.out.println("Enter 2 to Determine whether an integer value is odd or even");
			System.out.println("Enter 3 to Determine whether a date is valid or not");
			System.out.println("Enter 4 to Calculate Xn, where n is an integer");
			System.out.println("Enter 5 to Calculate n!  ");
			System.out.println("Enter 6 to Determine whether a number is prime or not");
			
			Integer ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter a year: ");
				a=sc.nextInt();
				ob.leapYearOrNot(a);
				break;
			case 2:
				System.out.println("Enter a number (Integer) :");
				a=sc.nextInt();
				ob.oddOrEven(a);
				break;
			case 3:
				System.out.println("Enter a Date :");
				a=sc.nextInt();
				ob.validDate(a);
				break;
			case 4:
				System.out.println("Enter two numbers (1st to the power 2nd):");
				a=sc.nextInt();
				ch=sc.nextInt();
				ob.xPowerN(a,ch);
				break;
			case 5:
				System.out.println("Enter a number (Integer) :");
				a=sc.nextInt();
				ob.factorial(a);
				break;
			case 6:
				System.out.println("Enter a number (Integer) :");
				a=sc.nextInt();
				ob.prime(a);
				break;
			default:
				System.out.println("Bye!!!");
				System.exit(0);
				break;
			}
		}
	}
	
	void leapYearOrNot(Integer n) {
		if (((n% 4 == 0) && (n% 100!= 0)) || (n%400 == 0))
			System.out.println(n + " is a leap year");
		else
			System.out.println(n+" is not a leap year");
		
	}
	
	void oddOrEven(Integer n) {
		if(n%2==0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");
	}
	
	void validDate(Integer n) {
		
	}
	
	void xPowerN(Integer x, Integer n) {
		System.out.println("First number to the power second number : "+(int) Math.pow(x, n));
		
	}
	
	void factorial(Integer n) {
		Integer fact=1,rem;
		if(n<=1)fact=1;
		else
			while(n>1) {
				fact*=n;
				n--;
			}
		System.out.println("Factorial is : "+ fact);
	}
	
	void prime(Integer n) {
		boolean flag =false;
		for(Integer i=2; i<Math.sqrt(n); i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+" is a Prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}
