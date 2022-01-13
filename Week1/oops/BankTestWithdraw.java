package com.week1.oops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTestWithdraw {
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
		Double c= b.withdraw(650.20, 1000.0);
		assertEquals(349.8,c);
	}

}
