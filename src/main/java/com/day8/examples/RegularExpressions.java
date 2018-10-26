package com.day8.examples;
/*You are updating the username policy on your company's internal networking platform.
 * According to the policy, a username is considered valid if all the following constraints are satisfied:
• The username consists   of 8 to 30 characters inclusive. If the username consists of less than or greater than 
characters, then it is an invalid username.
• The username can only contain alphanumeric characters and underscores (_). 
Alphanumeric characters describe the character set consisting of lowercase characters , 
uppercase characters , and digits .
• The first character of the username must be an alphabetic character, i.e., 
either lowercase character or uppercase character.
For example:
Username
Validity
Julia
INVALID; Username length < 8 characters
Samantha VALID
Samantha_21  VALID
INVALID; Username begins with non-alphabetic character
Samantha?21 INVALID; '?' character not allowed
Update the value of regularExpression field in the UsernameValidator class so that
the regular expression only matches with valid usernames.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegularExpressions {
	
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
        PrintWriter outputStream = null;
		
		 //Scanner s = null;
		// List<String> input = new ArrayList<String>();
         String username;	     

	        try {
	        	inputStream = new BufferedReader(new FileReader("src/main/resources/username.txt"));
	        	outputStream = new PrintWriter(new FileWriter("src/main/resources/newUsername.txt"));
	            while ((username = inputStream.readLine()) != null) {
	            	//if(username.matches("^(?!_)^(\\D)\\w{7,29}"))
	            	//if(username.matches("^(?!_)^(\\D)\\w{7,29}$")) {
	            	if (username.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}")) {
	                System.out.println(username);
	                outputStream.println(username);             
	            	}else {
	            		System.out.println("Invalid Input");
	            	}
	            }
	        } finally {
	            
	        }     if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
	    }
		

}


