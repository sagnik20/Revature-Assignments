package com.week1.utility;

import java.util.Scanner;

public class Convert {
	
	void toBinary(Integer deci) {
		System.out.println("Binary number is "+ Integer.toString(deci, 2));
	}
	
	void toOctal(Integer deci) {
		Integer rem;
		String octal = "";
		char octalchars[]={'0','1','2','3','4','5','6','7'};  
		while(deci>0) {
			rem = deci%8;
			octal = octalchars[rem]+octal;
			deci=deci/8;
		}
		
		System.out.println("octal number is "+octal);
	}
	
	void toHexaDecimal(Integer deci) {
		System.out.println("Hexadecimal number is "+ Integer.toHexString(deci));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer deci = sc.nextInt();
		Convert ob = new Convert();
		ob.toBinary(deci);
		ob.toHexaDecimal(deci);
		ob.toOctal(deci);
		sc.close();
	}

}
