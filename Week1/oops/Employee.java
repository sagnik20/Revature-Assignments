package com.week1.oops;

public abstract class Employee {
	Integer empId;
	String empName;
	
	void input(Integer id, String name){
		this.empId = id;
		this.empName = name;
	}
	
	void output() {
		System.out.println("Employee ID : "+ this.empId);
		System.out.println("Employee Name: "+ this.empName);
	}
	
	abstract void roles_Responsibilities();

}
