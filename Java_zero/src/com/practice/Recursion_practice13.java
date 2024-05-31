package com.practice;

public class Recursion_practice13 {

	// fibonnacci using recursion
	static int fibo (int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else 
		{
			return fibo(n-1) + fibo (n-2);
		}
	}
	
	static int fibo2 (int m )
	{
		if(m==1||m==2)
		{
			return m-1;
		}
		else
		{
			return fibo2(m-1) + fibo2(m-2);
		}
	}
	
	static void repeat(int l)
	{
		if(l==0)
		{
			return;
		}
		System.out.println("4");
		repeat(l-1);
	}
		
	public static void main(String[] args) {
		
		// fibo = 0,1,1,2,3,5,8,13
		int ans = fibo(9);
		System.out.println(ans);
		
		int ans2 = fibo2(9);
		System.out.println(ans2);	
		
		repeat(4);
	}
}
