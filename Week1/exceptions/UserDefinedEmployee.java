package com.week1.exceptions;

import java.util.ArrayList;
import java.util.List;

class EmployeeException extends Exception{

	@Override
	public String toString() {
		return "This employee is there in the Data Structure!";
	}
	

}


public class UserDefinedEmployee {
	public static void main(String[] args) {
		List<String> a =new ArrayList<>();
		a.add("ABC");
		a.add("AVC");
		a.add("SCX");
		a.add("AHC");
		a.add("AVF");
		a.add("ACX");
		
		if(a.contains("SCX")) {
			try {
				throw new EmployeeException();
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}