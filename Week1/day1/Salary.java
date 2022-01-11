package com.week1.day1;

import java.util.Scanner;

public class Salary {
	Integer basic, DA, HRA, Gross, incomeTax, netSalary;
	
	public static void main(String[] args) {
		Salary emp = new Salary();
		emp.getBasic();
		emp.calcDA();
		emp.calcHRA();
		emp.calcGrossSalary();
		emp.calcIT();
		emp.netSalary();

	}
	
	void getBasic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic pay : ");
		this.basic = sc.nextInt();
		System.out.println("Basic pay: "+ this.basic);
	}
	
	void calcDA() {
		this.DA = (int) (this.basic * 0.1);
		System.out.println("Dearness Allowance: "+ this.DA);
	}
	
	void calcHRA() {
		this.HRA = (int) (this.basic * 0.07);
		System.out.println("House rent allowance : "+ this.HRA);
	}
	
	void calcGrossSalary() {
		this.Gross = this.basic + this.DA + this.HRA;
		System.out.println("Gross Salary: "+ this.Gross);
	}
	
	void calcIT() {
		this.incomeTax = (int)(this.Gross * 0.08);
		System.out.println("Income Tax: "+ this.incomeTax);
	}
	
	void netSalary() {
		this.netSalary = this.Gross - this.incomeTax;
		System.out.println("Net Salary: "+ this.netSalary);
	}

}
