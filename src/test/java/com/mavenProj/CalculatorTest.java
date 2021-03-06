package com.mavenProj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test
	public void testCalculator(){
		Calculator c = new Calculator();
		Assert.assertEquals(c.calculate(2,3,'+'), 5);
	}
	
	@Test
	public void testCalculator1(){
		Calculator c = new Calculator();
		Assert.assertEquals(c.calculate(2,3,'*'), 6);
	}
	
	@Test
	public void testCalculator2(){
		Calculator c = new Calculator();
		Assert.assertEquals(c.calculate(6,3,'/'), 2);
	}
}
