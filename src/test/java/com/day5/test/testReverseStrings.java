package com.day5.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.day5.exercises.*;
// com.week2.day4.examples.computeSum;;


public class testReverseStrings {
  @Test
  public void testReverseWordsInArray() {
	   
	   String result = reverseWordsInArray.reverseString("Hello Dear World!");
	   Assert.assertEquals( result, "World! Dear Hello");
  }
   @Test
   public void testReverse(){
	String result_1 = reverceWordsInArrayUsingStringBuilder.reverse("11 12 13");
	Assert.assertEquals(result_1, "13 12 11");
	

	
   }
}