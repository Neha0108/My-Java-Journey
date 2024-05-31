package com.practice;

/*for( int a = 4; a >0; a++)
{
	for(int b = 0; b<a; b--)
	{
		System.out.print("*");
	}
	System.out.print("/n");
}
*/

public class Pattern_making {

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
	
	static void patternrepeating(int x)
	{
		// recursion
		if(x>0)
		{
			patternrepeating(x-1);
			for(int m = 0; m<x;m++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int x = 4; x>0; x--) {
			for(int y = 0; y<x; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int z = 4; z>0; z--)
		{
			System.out.println("****");
		}
		
		pattern2(5);
		patternrepeating(9);
		
	}

}
