package com.day6.exercises;

import java.util.Arrays;

public class TwoDemensionArray {
	/*Write a method called TransPoseMatrix() that takes 2 
	 * dimension Array as input and returns  a transposed array.
Example  :
Original Array
1 2 3 
4 5 6 
7 8 9 
 The Transpose Matrix 
1 4 7 
2 5 8 
3 6 9*/

	public static void main(String[] args) {
		int [][] arrayOfInt = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(Arrays.deepToString(arrayOfInt));
		transPoseMatrix1(arrayOfInt);
		
			System.out.println(" ");
	
	}
	static public int[][] transPoseMatrix1(int [][] arrayOfInt) {
		
		/*for(int row =0; row < arrayOfInt.length;row++) {
			for(int column=0; column< arrayOfInt[0].length;column++) {
				System.out.printf("%d ", arrayOfInt[column][row]);
			}
		
		}*/
		for(int row1 =0; row1 < arrayOfInt.length;row1++) {
			for(int column1=0; column1< arrayOfInt[0].length;column1++) {
				arrayOfInt[row1][column1]=arrayOfInt[row1][column1];
				System.out.printf("%d ", arrayOfInt[column1][row1]);
				
			}
			System.out.println(" ");
		}
		
		return arrayOfInt;
		
		/*System.out.println(" ");
		System.out.println(arrayOfInt[0][0] + " " + arrayOfInt[1][0] + " " + arrayOfInt[2][0]);
		System.out.println(arrayOfInt[0][1] + " " + arrayOfInt[1][1] + " " + arrayOfInt[2][1]);
		System.out.println(arrayOfInt[0][2] + " " + arrayOfInt[1][2] + " " + arrayOfInt[2][2]);
        */
		
	}

}
