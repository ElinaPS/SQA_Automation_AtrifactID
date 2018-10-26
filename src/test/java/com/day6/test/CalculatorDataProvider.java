package com.day6.test;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {
	   @DataProvider(name = "addMethodDataProvider")
	     public static Object[][] addMethodDataProvider() {
	         return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
	     }
	   @DataProvider(name = "subMethodDataProvider")
	     public static Object[][] subMethodDataProvider() {
	         return new Object[][] { { 10, 5, 5 }, { 13, 7, 6 }, { 4, 5, -1 } };
	     }
	   @DataProvider(name = "mulMethodDataProvider")
	     public static Object[][] mulMethodDataProvider() {
	         return new Object[][] { { 2, 5, 10 }, { 3, 7, 21 }, { 4, 5, 20} };
	     }
}