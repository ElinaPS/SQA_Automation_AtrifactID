package com.day5.exercises;

public class reverceWordsInArrayUsingStringBuilder {
	



	public static void main(String[] args) {

         System.out.println(reverse("Hello World"));

	}
	public static String reverse (String originalString) {
		 //String orinalString = "Hello World";
	     String [] originalArray = originalString.split(" "); // or String[] words= sentence.split("//s+"); 
	     StringBuilder sb = new StringBuilder("");
   	//String revWord="";
	     for (int i =0; i < originalArray.length; i++) {    
	         sb.append(originalArray[originalArray.length -1 -i] + " ");
   		
   	
   	}
   	/*for (int i =originalArray.length -1; i >=0; i--) {    
	         sb.append(originalArray[i]).append(" ");
   		
   	
   	}*/
   	 
       //sb.reverse();
        return sb.toString().trim();
        //sb.replace(start, end, "Hello World")
		
	}

}
