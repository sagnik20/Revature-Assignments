package com.week1.utility;

public class Employee {
	Integer empNo;
	String empName;
	Long empSalary;
	
	
	public Employee(Integer empNo, String empName, Long empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee Number=" + empNo + ", Name=" + empName + ", Salary=" + empSalary ;
	}
	
	

}
