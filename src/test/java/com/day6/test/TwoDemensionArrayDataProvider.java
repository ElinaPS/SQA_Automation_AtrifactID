package com.day6.test;

import org.testng.annotations.DataProvider;

public class TwoDemensionArrayDataProvider {
        @DataProvider(name = "transPoseMatrix1")
	    public static Object[][] transPoseMatrix1(){
		   return new Object[][] {{ 1,4,7}, {2,5,8}, {3,6,9,}};
	}
		
}

