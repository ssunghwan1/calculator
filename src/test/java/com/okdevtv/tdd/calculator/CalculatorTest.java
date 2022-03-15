package com.okdevtv.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(3, Calculator.add(1,2));
	}
	@Test
	public void testSubtract() {
		assertEquals(2, Calculator.subtract(3,1));
	}
	// testMultiply
	// testDivide

}
