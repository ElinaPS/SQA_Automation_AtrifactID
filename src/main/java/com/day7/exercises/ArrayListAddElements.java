package com.day7.exercises;

import java.util.ArrayList;

public class ArrayListAddElements {
    /*Write a Method called addElements() 
     * that takes in input as a String Array and 
     * adds the elements to arrayList of Strings and 
     * returns the ArrayList<String> as output.
     * String[] elements={"Hello","World","How"}
     */
	public static void main(String[] args) {
		
		String[] elements={"Hello","World","How"};
		addElementsOfStringToArray(elements);

	}

	public static ArrayList<String> addElementsOfStringToArray(String []elements) {
		ArrayList<String> arrayFromString  = new ArrayList<String>();
		
		for(int i = 0; i < elements.length; i++) {
			arrayFromString.add(elements[i]);
						
		}
		System.out.println("output " + arrayFromString);
		
		
		return arrayFromString;
	}
}
