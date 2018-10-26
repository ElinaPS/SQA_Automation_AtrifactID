package com.day7.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayListToArray {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  
		  String[] asssetArray=convertArrayListToArray1();
		  String str="hello";
		  
		     System.out.println(" Array Values " +Arrays.toString(asssetArray));
		 }
		 public static String[] convertArrayListToArray1(){
		  ArrayList<String> assetTradingList = new ArrayList<String>(); 

		  assetTradingList.add("Stocks trading");
		  assetTradingList.add("futures and option trading");
		  assetTradingList.add("electronic trading");
		  assetTradingList.add("forex trading");
		  assetTradingList.add("gold trading");
		  assetTradingList.add("fixed income bond trading");
		  String [] assetTradingArray = new String[assetTradingList.size()];
		  assetTradingList.toArray(assetTradingArray);

		         return assetTradingArray;
		        
		  
		 }

}

