package com.day5.exercises;

public class reverseWordsInArray {
	/*Write a program to reverse words in sentence. 
	 * If the Sentence is "Hello World". It should be "World Hello"
    and write a test case for it*/
	
    public static String reverseString(String s) {
    	String [] originalArray = s.split(" "); // or String[] words= sentence.split("//s+"); 
    	
    	String revWord="";
    	for (int i =0; i < originalArray.length; i++) {    
	         revWord = revWord + originalArray[originalArray.length -1 -i] + " ";
    		
    	
    	}
    	System.out.println(s);
    	System.out.println(revWord);
    	return revWord.trim();
    	
    }

	public static void main(String[] args) {
		
		
		reverseString("Hello World A B C ");
		
		
	   
		

	}

}
