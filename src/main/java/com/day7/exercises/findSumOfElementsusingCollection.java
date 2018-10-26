package com.day7.exercises;



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//import com.day7.test.input;

public class findSumOfElementsusingCollection {
    /*Given an array of integers finds two elements 
     * in the array whose sum is equal to n. int[] input={2,6,3,9,11}*/
	public static void main(String[] args) {
		int[] input={2,6,3,9,11,7};
		Arrays.sort(input);
		int s = 9;
		findSumOfTwoElements(input, s);
		printPairsUsingSet(input, s);
		findSumOfTwoElementswithHashMap(input,s);
	}

	public static void findSumOfTwoElements(int [] input, int s) {
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for (int i = 0; i < input.length; i++) {
			int temp = s-input[i];
				
			if(input[i]+temp ==s && hset.contains(temp)){
				
				//if(!hset.contains(input[i])) 
					 System.out.println("Pair with given sum using HashSet " + 
                         s + " is (" + input[i] + 
                         ", "+temp+")");
			} else {
				hset.add(input[i]);	
				//i++;
			  }
			/*if (hset.contains(s-input[i])) {
				System.out.println("Pair with given sum using HashSet " + 
                        s + " is (" + input[i] + 
                        ", "+ s-input[i]+")");
			}else {
				hset.add(input[i]);	
			}*/
			
		}
		System.out.println(hset);
		}
	public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        HashSet<Integer> set = new HashSet<Integer>(numbers.length);
        
      //{2, 6, 5,7, 9, 11}
        //n=9
        //iteration1
        //value:2
        //target=9-2=7
        //set=2
        //iteration2
        //n=9
        //vaue:6
        //target=3
        //set=6
        //iteration3
        //n=9
        //value:5
        //target=4
        //set=5
        //n=9
        //value=7
        //target=2
        //
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
	   static public void findSumOfTwoElementswithHashMap(int [] input, int s) {
		   
		   HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		   for (int i = 0; i<input.length;i++) {
			   hmap.put(i, input[i]);
		   }
		   for (int i =0; i < input.length;i++) {
		         int temp1 = s - input[i];
		         if(hmap.containsKey(temp1)) {
		        	 System.out.println("Pair with given sum using HashMap " + 
                             s + " is (" + input[i] + 
                             ", "+temp1+")"); 
		         }
		   }
		   System.out.println(hmap);
		//return hmap;
	   }


}

