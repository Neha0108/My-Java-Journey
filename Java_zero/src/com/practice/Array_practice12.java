package com.practice;

public class Array_practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first problem
		float[] arr = {9.8f, 5.6f, 7.8f, 10.13f};
		float sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);
		
		// second problem
		float check = 5.6f;
		for(float element:arr)
		{
			if(check == element)
			{
				System.out.println("true");
				break;
			}
			System.out.println("false");
		}
		// calculating average marks
		float[] marks = {88.65f, 67.98f, 45.6f, 98.34f, 55.65f, 67.f};
		float addition = 0;
		for(int m = 0; m<marks.length; m++)
		{
			addition += marks[m];

		}
		System.out.println(addition);
		
		float average = addition/marks.length;
		System.out.println(average);
		
		// finding maximum element
		float largest = 0;
		for(int n = 0; n < marks.length; n++)
		{
			if(largest<marks[n])
			{
				largest = marks[n];
			}
		}
		System.out.println(largest); 
		
		// addition of two matrices 
		int [][] matrix = {
				{1,2,3},
				{5,6,7}};
		
		int [][] matrixx = {
				{5,6,7},
				{3,7,4}};
		
		int [][] result = {
				{0,0,0},
				{0,0,0}};
		
		for(int j = 0; j<matrix.length;j++)
		{
			for(int k = 0; k < matrix[j].length; k++)
			{
				System.out.format("setting value for j=%d and k = %d\n", j,k);
				result[j][k] = matrix[j][k] + matrixx[j][k];
			}
		}
		for(int j = 0; j<matrix.length;j++)
		{
			for(int k = 0; k < matrix[j].length; k++)
			{
				System.out.print(result[j][k] + " ");
				result[j][k] = matrix[j][k] + matrixx[j][k];
			}
			System.out.println("");
		}
		
		// reversing an array
		int [] num = {12,23,43,67,86,95,200};
		int length = num.length;
		int x = Math.floorDiv(length,2);
		// returns highest integer value
		for(int s = 0; s<x; s++)
		{
			int temp = num[s];
			num[s] = num[length-s-1];
			num[length-s-1] = temp;
		}
		for(int view: num)
		{
			System.out.println(view+ " ");
		}
		
		// sorted array
		boolean isSorted = true;
		for(int g = 0; g < num.length-1; g++) {
		    if(num[g] < num[g+1]) {
		        isSorted = false;
		        break;
		    }
		}
		if(isSorted)
		{
			System.out.println("the array is sorted");
		}
		else {
			System.out.println("array is not sorted");
		}
		
		// maximum element
		int max = Integer.MIN_VALUE;
		//  initializes a variable max with the minimum possible value
		for(int e:num)
		{
			if(e>max)
			{
				max = e;
			}
		}
		System.out.println(max);
		
		//minimum element
		int min = Integer.MAX_VALUE;
		for(int f:num)
		{
			if(f<min)
			{
				min = f;
			}
		}
		System.out.println(min);
		
		
}
}