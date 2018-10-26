package com.day6.test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.day5.exercises.*;
// com.week2.day4.examples.computeSum;;


public class testReverseStrings {
  @Parameters({"stringIs", "stringHaveToBe"})
  @Test
  public void testReverseWordsInArray(String is, String haveToBe) {
	   
	   String result = reverseWordsInArray.reverseString("Hello Dear World!");
	   Assert.assertEquals(reverseWordsInArray.reverseString(is), haveToBe);
  }
   @Test
   public void testReverse(){
	String result_1 = reverceWordsInArrayUsingStringBuilder.reverse("11 12 13");
	Assert.assertEquals(result_1, "13 12 11");
	

	
   }
}