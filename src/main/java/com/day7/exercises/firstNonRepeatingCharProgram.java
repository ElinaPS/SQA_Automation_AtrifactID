package com.day7.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class firstNonRepeatingCharProgram {
    /*Write a method called firstNonRepeatingChar() 
     * that takes a String as parameter and returns
     *  the first Non repeated char.
     *  If the String is “swiss”. It should return w.*/
	public static void main(String[] args) {
		String s= "igor";
		System.out.println(firstNonRepeatingCharWithHashMap(s));
		//System.out.println(firstNonRepeatingCharWithHashSet(s));
		//firstNonRepeatingCharWithHashSet(s);
		//System.out.println(firstNonRepeatingCharWithHashSet(s));

	}
	
	/*public static char firstNonRepeatingCharWithHashSet(String s) {
		 HashSet<Character> hset = 
	                new HashSet<Character>();
		 ArrayList<Character> obj = new ArrayList<Character>();
		 char []  s1 = s.toCharArray();
		// Arrays.sort(s1);
		/* for(char i : s.toCharArray()) {
	    		hset.add(i);
	    		
		 }
		 
		 for(int i = 0; i<s1.length-1 ;i++) {
			 if(s1[i] != s1[i+1] ) {
			    obj.add(s1[i]);
			 }else {
				 hset.add(s1[i]);
			 }
		 }
		 
		 System.out.println(obj.get(0));
		 System.out.println(obj);
		 System.out.println(hset);
		// System.out.println(hset.contains('w'));
		
		return ' ';

	}*/


	public static char firstNonRepeatingCharWithHashMap(String s) {
    	
    	HashMap<Character, Integer> hmap = 
                new HashMap<Character, Integer>();
    	
    	
    	for(char i : s.toCharArray()) {
    		if (!hmap.containsKey(i)) {
    		   hmap.put(i, 1);
    		}else {
    			hmap.put(i, hmap.get(i)+1);
    		}
    	}
    	  
    	System.out.println(hmap);
    	//Iterator<Character> hMapIterator = hmap.keySet().iterator();
    	for(char a : hmap.keySet()) {
    		if(hmap.get(a)==1) {
    			System.out.println("priting value "+a);
    			return a;
    		}
    	    	
    	//Integer firstNonDublicate = hmap.get(1);
    	//System.out.println(hmap.get(1));
		//return hmap.get(1);
    		
    }
	return ' ';
  }
}
