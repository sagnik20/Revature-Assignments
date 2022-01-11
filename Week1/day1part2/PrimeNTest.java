package com.week1.day1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNTest {

	@Test
	void test() {
		int num = PrimeN.prime_num(10);
		assertEquals(4,num);
	}

}
