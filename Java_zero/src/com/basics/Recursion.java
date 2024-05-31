package com.basics;

public class Recursion {
/*
 *  a recursive function in java can call itself 
 */
	
	// recursive approach
	static int factorial(int n )
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else {
			return n * factorial(n-1); 
		}
	}
	
	static int sum (int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else {
			return n + sum(n-1);
		}
	}
	
	static int fibo( int[] arr , int m)
	{
		if(arr[0] == 0)
		{
			return 0;
		}
		else if(arr[1] == 1)
		{	
			return 1;
		}
		else {
			return arr[m-1] + arr[m-2];
			 
		}
	}
	public static void main(String[] args) {
	
		int ans = factorial(7);
		System.out.println(ans);
		int ans2 = sum(12);
		System.out.println(ans2);
		
		// iterative approach
		int x =7;
		int a ;
		int factorial = 1;
		for(a=x;a>=1;a--)
		{
			factorial *= a;
		}
		System.out.println(factorial);
		
		int[] arr = {0,1,1,2,3,5,8};
		int ans3 = fibo(arr,5);
		System.out.println(ans3);
	}

}
