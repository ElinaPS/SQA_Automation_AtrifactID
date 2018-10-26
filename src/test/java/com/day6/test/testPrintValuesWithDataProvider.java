package com.day6.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testPrintValuesWithDataProvider {
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { 5, "five","two"},
	   {6, "six","six1"},
	   {7,"seven","seven1"}, 
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(int i, String s1, String s2) {
	 System.out.println(i + " " + s1 + " " + s2);
	} 
/*{5, "five","two"}, 
 {6, "six","six1"},{7,"seven","seven1"}*/

	
	
	
	
	

}
