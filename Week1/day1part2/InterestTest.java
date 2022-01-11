package com.week1.day1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterestTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int val = 10000;
		double interest = Interest.calInterest(val);
		double exp = (val*0.05);
		assertEquals(exp,interest);
	}

}
