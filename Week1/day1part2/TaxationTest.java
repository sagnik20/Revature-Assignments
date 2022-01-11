package com.week1.day1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxationTest {

	@Test
	void test() {
		double tax = Taxation.calTax(300);
		assertEquals((300*0.15),tax);
	}

}
