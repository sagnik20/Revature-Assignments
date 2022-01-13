package com.week1.oops;

public class Bank {
	Double deposit(Double amount, Double balance) {
		balance+=amount;
		return balance;
	}
	
	Double withdraw(Double amount, Double balance) {
		if(balance>=amount) {
			return (balance-amount);
		}
		else
			return 0.0;
	}

}
