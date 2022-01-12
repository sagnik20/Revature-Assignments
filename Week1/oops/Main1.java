package com.week1.oops;

import java.util.Scanner;

class Account {
	Integer accountNo;
	String accountType;
	Integer accountBalance;
	
	Account(){
		accountNo = 0;
		accountType = "";
		accountBalance = 0;
	}
	
	
	void setAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Account Number");
		this.accountNo = sc.nextInt();sc.nextLine();
		System.out.println("Enter your Account Type");
		this.accountType = sc.nextLine();
		System.out.println("Enter your "+this.accountType+" Account balance");
		this.accountBalance = sc.nextInt();
		
	}
	
	void withdraw() {
		if(this.accountBalance>1000)
			this.accountBalance-=1000;
		else {
			System.out.println("You don't have enough balance to Withdraw!");
			System.out.println("Minimun Balance required is $1000");
			System.out.println("Your Account Balance: $"+ this.accountBalance);
		}
	}
	
	void deposit() {
		System.out.println("Your Previous Account Balance: $"+ this.accountBalance);
		this.accountBalance+=1000;
		System.out.println("Your Updates Account Balance: $"+ this.accountBalance);
	}
	
	void displayAccountBalance() {
		System.out.println("Account Number: "+ this.accountNo);
		System.out.println("Account Type: "+ this.accountType);
		System.out.println("Accoutn Balance: $"+ this.accountBalance);
	}

}

public class Main1{
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountDetails();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====Menu====");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter anything else to exit!");
			
			Integer ch = sc.nextInt();
			switch(ch) {
			case 1:
				ac.withdraw();
				break;
			case 2:
				ac.deposit();
				break;
			case 3:
				ac.displayAccountBalance();
				break;
			default:
				System.out.println("Exiting!!!");
				System.exit(0);
				break;
			}
		}

	}
}
