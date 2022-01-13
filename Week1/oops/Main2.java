package com.week1.oops;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Student ac = new Student();
		ac.setStudentDetails();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====Menu====");
			System.out.println("1. Find total");
			System.out.println("2. Display Student Details");
			System.out.println("Enter anything else to exit!");
			
			Integer ch = sc.nextInt();
			switch(ch) {
			case 1:
				ac.findTotal();
				break;
			case 2:
				ac.dispStudentDetails();;
				break;
			default:
				System.out.println("Exiting!!!");
				System.exit(0);
				break;
			}
		}

	}

}

class Student{
	Integer rollNo;
	String name;
	Integer mark1;
	Integer mark2;
	Integer mark3;
	Integer total;
	
	void setStudentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Roll No");
		this.rollNo = sc.nextInt();sc.nextLine();
		if(this.rollNo<=0) {
			System.out.println("Entered an invalid Roll No. \nExiting!!");
			System.exit(0);
		}
		System.out.println("Enter the Student Name");
		this.name=sc.nextLine();
		if(this.name=="") {
			System.out.println("Entered an invalid Name \nExiting!!");
			System.exit(0);
		}
		System.out.println("Enter the Student Marks in Subject 1");
		this.mark1=sc.nextInt();
		System.out.println("Enter the Student Marks in Subject 2");
		this.mark2 = sc.nextInt();
		System.out.println("Enter the Student Marks in Subject 3");
		this.mark3 = sc.nextInt();
				
	}
	
	void findTotal() {
		if(this.mark1>=0 && this.mark2>=0 && this.mark3 >=0)
			this.total = this.mark1+this.mark2+this.mark3;
		else
			System.out.println("Entered marks should not be Negetive! Can't calculate Total");
	}
	
	void dispStudentDetails() {
		if(this.rollNo>0)
			System.out.println("Roll NO : "+ this.rollNo);
		else
			System.out.println("Didn't have valid Roll Number");
		if(this.name!="")
			System.out.println("Name : "+ this.name);
		else
			System.out.println("Didn't have valid Name");
		System.out.println("Marks in Subject 1 : "+ this.mark1);
		System.out.println("Marks in Subject 2 : "+ this.mark2);
		System.out.println("Marks in Subject 3 : "+ this.mark3);
		if(this.total != null)
			System.out.println("Total : "+ this.total);
		else {
			this.findTotal();
			System.out.println("Total : "+ this.total);
		}
		
	}
}
