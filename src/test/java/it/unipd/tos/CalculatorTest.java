package it.unipd.tos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}
	
	/*
	//test forces fail: (expected negative from sum of positive ->impossible)
	@Test
	 public void evaluatesnegativeExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(-6, sum);
	}
	*/
}