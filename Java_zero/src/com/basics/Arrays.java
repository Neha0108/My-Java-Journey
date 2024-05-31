package com.basics;

public class Arrays {
	// array is a collection of similar types of data
	public static void main(String[] args) {
		
		int[] marks;// declaration
		marks = new int[5]; // memory allocation
		
		int[] roll = {23,45,76,45,64}; // declaration + initialize
		
		System.out.println(roll);
		// it will print the address of the array marks

		//System.out.println(marks[]);
		int[] total = new int[5]; // declaration + memory allocation
		total[0] = 10;
		total[1] = 20;
		total[2] = 30;
		total[3] = 40;
		total[4] = 50;
		System.out.println(total[3]);
		
		System.out.println(roll.length);
		
		// displaying array -- array traversal
		for(int i=0; i<roll.length; i++)
		{
			System.out.println(roll[i]);
		}
		
		System.out.println("array in reverse order");
		for(int i = roll.length - 1 ; i>=0 ; i--)
		{
			System.out.println(roll[i]);
		}
		
		// for each loop
		System.out.println("traversing array using for loop");
		for(int element: roll)
		{
			System.out.println(element);
		}
		
		// multi- dimensional array
		int [][] matrix = {
				{1,2,3},
				{5,6,7},
				{9,6,3}};
		
		for(int m = 0; m < matrix.length; m++) {
			for(int n = 0; n < matrix[m].length; n++) {
				System.out.print(matrix[m][n]+ " ");
			}
			System.out.println("");
			
		}
		}
	}