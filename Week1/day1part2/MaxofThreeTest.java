package com.week1.day1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxofThreeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		int max = MaxofThree.calMax(5, 9, 4);
		int exp = 9;
		assertEquals(exp,max);
	}

}
