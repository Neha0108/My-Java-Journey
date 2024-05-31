package com.practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial
				int x =6;
				int a ;
				int factorial = 1;
				for(a=x;a>=1;a--)
				{
					factorial *= a;
				}
				System.out.println(factorial);
				
				int q =6;
				int w = 1;
				int factorials = 1;

				while(w<=q)
				{
					factorials *=w;
					w++;
				}
				System.out.println(factorials);
	}

}
