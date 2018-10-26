package com.day8.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithOonConsole {

	public static void main(String[] args) throws IOException{
		
		BufferedReader inputStream = null;		
		parseCSVData(inputStream);
		double sArr[][]= parseCSVData(inputStream);
		 for (int i = 0; i < sArr.length; i++) {

			   for (int y = 0; y < sArr[i].length; y++) {

			    System.out.print(sArr[i][y] + "\t");

			   }

			   System.out.println();
			  }
  }

    public static double[][] parseCSVData ( BufferedReader inputStream) throws IOException{
    	String inputFile = "src/main/resources/test.txt";
    	inputStream = new BufferedReader(new FileReader(inputFile));
    	 int row = 4;
         int column =5;
    	double[][] sArr = new double [row][column];
    	int rowsNew = 0;

		try {
			
			String l;
			while ((l = inputStream.readLine()) != null) {
				String [] line = l.split(",");
               
                
				for(int i =0; i < line.length;i++) {
					
					//for(int j=0; j<line.length;j++) {//don't need
					sArr[rowsNew][i] = Double.parseDouble(line[i]);
						
						System.out.print(rowsNew);
					}
					System.out.println(" ");
					rowsNew++;
					
				}
			System.out.println(rowsNew);
				
			
		} finally {
            if (inputStream != null) {
                inputStream.close();
            }
		

	   }
		return sArr;
    }

}

