package com.day6.test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.day6.exercises.Calculator;

import junit.framework.Assert;

public class TestNGMultipleDataProviderExample {
	 
	 @Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	 public void testAddMethod(int a, int b, int expectedResult) {
	         int sum=Calculator.add(a, b);
	 
	         Assert.assertEquals(sum, expectedResult);
	    }
	 @Test(dataProvider = "subMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	 public void testSubMethod(int a, int b, int expectedResult) {
		 int sum = Calculator.sub(a, b);
		 Assert.assertEquals(sum, expectedResult);
	 }
	 
	 @Test(dataProvider = "mulMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	 public void testMulMethod(int a, int b, int expectedResult) {
		 int sum = Calculator.mul(a, b);
		 Assert.assertEquals(sum, expectedResult);
	 }
	 
	 
	
	
}	
