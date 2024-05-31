package com.basics;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//incremented for loop
		for (int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}

		for ( int x = 1; x <=100; x++)
		{
			if(x%2 != 0)
			{
			System.out.println(x);
			}
		}
		
		// 2n = even number
		//2n+1 = odd number
		for (int y = 1; y<=10; y++)
		{
			System.out.println(2*y+1);
			
		}
		
		// decremented for loop
		for (int z = 10; z > 0; z--)
		{
			System.out.println(z);
		}
		
		int n = 40;
		for (int a = n; a >0 ; a--)
		{
				System.out.println(a);

		}
	}

}
