package com.day6.exercises;
import java.util.Arrays; 
import java.lang.reflect.Array;

public class removeDublicates {
    /*Write a program to remove duplicates
     * from the array {1, 2, 1, 1, 1, 1, 1}
     *  and write a test case for it.*/
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 1, 3, 1, 4};
		Arrays.sort(numbers);
		int n = numbers.length;
	    n =numbOfUniqeElementsOfArray(numbers,n);
       
	    for (int k =0; k<n; k++) {
		     System.out.print(numbers[k]+ " ");	
		    }		
	}
	
	public static int numbOfUniqeElementsOfArray(int [] numbers,int n) {
		
		int j = 0;
		for(int i = 0; i < n-1; i++){
			if(numbers[i]!=numbers[i+1]) {
				numbers[j++]=numbers[i];
			}
		}
		    numbers[j++] = numbers[n-1];	 
		   		    
		return  j;
	
    }
}