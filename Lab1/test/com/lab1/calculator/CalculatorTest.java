package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup()
	{
		calculator=new Calculator();
	}

	

	@Test
	public void addtest()
	{
		assertEquals(5, calculator.add(3, 2));
		
		
	}
	@Test
	public void subtracttest()
	{
		
		assertEquals(1, calculator.subtract(3, 2));
		
		
	}
	@Test
	public void dividetest()
	{
		
		assertEquals(2, calculator.divide(4, 2));
		
		
	}
	@Test
	public void multiplytest()
	{
		
		assertEquals(6, calculator.multiply(3, 2));
	
		
	}
	@Test
	public void isequalpasstest()
	{
		assertTrue(calculator.isEqual(5, 5));
	}
	@Test
	public void isequalfailtest()
	{
		assertFalse(calculator.isEqual(9, 8));
	}
	
	
}
