package com.okdevtv.tdd.calculator;

public class Calculator {

	public static int add(int a, int b) {
		return a+b;
	}

	public static Object subtract(int i, int j) {
		return i-j;
	}

	public static Object multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	public static Object divide(int i, int j) {
		double a = (double)i;
		double b = (double)j;
		double result = a/b;

		return result;
	}

}
