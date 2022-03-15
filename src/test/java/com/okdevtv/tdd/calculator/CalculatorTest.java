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
	@Test
	public void testMultiply() {
		assertEquals(15, Calculator.multiply(5,3));
	}
	@Test
	public void testDivide() {
		assertEquals(2.5 , Calculator.divide(5,2));
	}

}
