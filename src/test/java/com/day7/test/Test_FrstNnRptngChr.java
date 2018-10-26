package com.day7.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.day7.exercises.firstNonRepeatingCharProgram;

public class Test_FrstNnRptngChr {
	@Test
	public void test_First_Non_Rep_Char() {
		
		
		Assert.assertEquals(firstNonRepeatingCharProgram.firstNonRepeatingCharWithHashMap("book"),'b');
		
	}

}
