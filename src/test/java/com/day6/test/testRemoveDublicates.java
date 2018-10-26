package com.day6.test;

import org.testng.annotations.Test;

import com.day6.exercises.removeDublicates;


import org.testng.Assert;
public class testRemoveDublicates {

	@Test
	public void testRemoveDublicates() {
		int[] arr = {4,3,5,6,6,7,7,1};
		int n = arr.length;
		int result = removeDublicates.numbOfUniqeElementsOfArray(arr, n);
		Assert.assertEquals(result,6 );
		
	}
}
