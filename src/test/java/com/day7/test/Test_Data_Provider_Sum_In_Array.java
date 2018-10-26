package com.day7.test;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.day7.exercises.findSumOfElementsusingCollection;

//import com.day6.test.findSumOfElementsusingCollection;

public class Test_Data_Provider_Sum_In_Array {
	@Test(dataProvider= "findSumOfTwoElementDataProvider", dataProviderClass = Data_Provider_Sum_In_Array.class)
	public void testFindSumOfTwoElementProvider(int[] input, int s, int[] expected) {
		int[] pair = findSumOfElementsusingCollection.findSumOfTwoElementswithHashMap(input, s);
		//Assert.assertEquals(pair, expected);
		Assert.assertEquals(pair, expected);
	}

	
}
