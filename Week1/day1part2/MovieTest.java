package com.week1.day1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void test() {
		float profit = Movie.calculateProfit(100);
		assertEquals(430,profit);
	}

}
