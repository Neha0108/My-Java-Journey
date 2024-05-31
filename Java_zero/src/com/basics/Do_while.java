package com.basics;

public class Do_while {
	static void pattern2(int l)
	{
		do {
	for(int n = l; n>0; n--)
	{
		for(int m = 0; m<n;m++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
		}
		while(l==0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		while(a<5)
		{
			System.out.println(a);
			a++;
		}
		
		int b = 5;
		
		do {
			System.out.println(b);
			b++;
		}
		while(b<5);
		
		int c = 10;
		// it will print 10 at once because do while loop run at least once
		// whether it is true or not
		do {
			System.out.println(c);
			c++;
		}
		while(c<5);
		
		pattern2(8);
	}

}
