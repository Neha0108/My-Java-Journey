package com.practice;

public class Fibonacci_series
{
							
	public static void main(String[] args) {
		int[] arr = new int[10] ;
		arr[0] = 0;
		arr[1] = 1;
		for(int m=2;m<10;m++)
		{
			arr[m] = arr[m-1]+arr[m-2];
		}
		for(int n = 0; n< arr.length; n++)
		{
			System.out.println(arr[n]);
		}
	}
}
