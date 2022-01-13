package com.week1.oops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTestDeposit {
	
	Bank b;

	@BeforeEach
	void setUp() throws Exception {
		b=new Bank();
	}

	@AfterEach
	void tearDown() throws Exception {
		b=null;
		
	}

	@Test
	void test() {
		Double c= b.deposit(650.65, 1500.12);
		assertEquals(2150.77,c);
	}

}
