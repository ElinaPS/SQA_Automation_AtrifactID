package com.day7.test;

import org.testng.annotations.DataProvider;

public class Data_Provider_Sum_In_Array {
	@DataProvider(name = "findSumOfTwoElementsDataProvider")
		public static Object[][] findSumOfTwoElementsDataProvider(){
			return new Object[][]  {{2,4,7,8}, {6}, {2,4},
				                    {2,4,7,8}, {6}, {2,4}
				                              };
				                     
			
		
	}
}

