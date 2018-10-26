package com.day7.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class removeDuplicatesUsingCollections {
    /*Write a method called removeDuplicatesUsingCollections()
    That takes integer array as argument and returns 
    ArrayList with duplicate elements.*/
	public static void main(String[] args) {
		
		int [] arrayNumbers = {2,3,4,3,4,5,6,2};
		Arrays.sort(arrayNumbers);
		
		//ArrayList<Integer> arrayOfIntOrinal = new ArrayList<Integer>();
		//System.out.println("Currently the array list has following elements:"+ arrayOfIntOrinal);
		removeDuplicatesUsingCollectionsMethod(arrayNumbers);
	}
	public static HashSet<Integer> removeDuplicatesUsingCollectionsMethod(int [] arrayNumbers){
		//ArrayList<Integer> arrayOfIntOrinal = new ArrayList<Integer>();
		HashSet<Integer> hset = new HashSet<Integer>();
		HashSet<Integer> hset1 = new HashSet<Integer>();
		//arrayOfIntOrinal.toArray();
		
		
		for (int k  : arrayNumbers) {
			if(!hset.add(k)) {
				hset1.add(k);
			}
		}
		

			 
		   		    
		
		System.out.println("Currently the array list has following elements:"+ hset1);
		
		return hset1;
		
		
	}

}
