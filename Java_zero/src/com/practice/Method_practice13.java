package com.practice;
public class Method_practice13 {
	
	static void table(int num)
	{
		for(int n=1;n<=10;n++)
		{
			int product = num*n;
			System.out.printf("%d x %d = %d \n",num ,n,product);
		}
	}	
	static void pattern(int x)
	{
		for(int n = 1; n<=x; n++)
		{
			for(int m = 1; m<=n;m++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
	static int sum(int n)
	{
		int add = 0;
		for(int j = 1; j<=n; j++)
		{
			add += j;
		}
		return add;
	}	
	// using recursive function
	static int sum2(int k)
	{
		if(k == 1)
		{
			return 1;
		}
		else {
			return k + sum2(k-1);
		}
	}
	static void pattern2(int l)
	{
		for(int n = l; n>0; n--)
		{
			for(int m = 0; m<n;m++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	static float average(float ...arr)
	{
		float result = 0;
		for(float a : arr)
		{
			result += a/arr.length;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(8);
		pattern(5);
		int ans =sum(12);
		System.out.println(ans);
		int ans2 = sum2(12);
		System.out.println(ans2);
		pattern2(5);
		float ans3 = average(3,6,7,8,12,13,40);
		System.out.println(ans3);
		
	}

}
