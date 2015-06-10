package com.mavenProj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test
	public void testCalculator(){
		Calculator c = new Calculator();
		Assert.assertEquals(c.calculate(2,3,'+'), 5);
	}
}
