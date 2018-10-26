package com.day6.test;

import org.testng.annotations.Test;

import com.day6.exercises.TwoDemensionArray;

import junit.framework.Assert;

public class TestNGTwoDemensionArrayDataProvider {

	public class TwoDemensionArrayDataProvider{
		@Test(dataProvider = "transPoseMatrix1" , dataProviderClass =TwoDemensionArrayDataProvider.class)
		public void testTransPoseMatrix1(int a, int b, int c) {
			int [][] arrayOfInt = {{1,2,3}, {4,5,6}, {7,8,9}};
			int [][] exp_result = {{1,4,7},{2,5,8},{3,6,9}};
			int[][] actual = TwoDemensionArray.transPoseMatrix1(arrayOfInt);
			Assert.assertEquals(actual[0][0], exp_result[0][0]);
		}
	}
}
