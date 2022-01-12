package com.week1.oops;

import java.util.Scanner;

public class Product {
	
	Integer productNo;
	String productName;
	Float price;
	Integer quantity;
	
	Product(){
		this.productNo = 0;
		this.productName = "";
		this.price = 0.0f;
		this.quantity = 0;
	}
	
	

	public Product(Integer productNo, String productName, Float price, Integer quantity) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p=new Product();
		System.out.println("Enter Product details:Product No-Prduct Name-Quantity-Price");
		Integer no=sc.nextInt(); sc.nextLine();
		String name=sc.nextLine();
		Float pri=sc.nextFloat();
		Integer q=sc.nextInt();
		Product p1 = new Product(no,name,pri,q);
		System.out.println("Product No | Product Name | Quantity | Price | Total Amount");
		System.out.println("___________________________________________________________");
		System.out.println(p.productNo+" | "+p.productName+" | "+p.quantity+" | "+p.price+" | "+ (p.price*p.quantity));
		System.out.println(p1.productNo+" | "+p1.productName+" | "+p1.quantity+" | "+p1.price+" | "+ (p1.price*p1.quantity));

	}

}
