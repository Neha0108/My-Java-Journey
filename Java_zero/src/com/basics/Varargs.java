package com.basics;

public class Varargs {
// passing variable number of arguments by storing them in an array
// and using for each loop
	static int sum(int ...arr)
	{
		int result = 0;
		for(int a : arr)
		{
			result +=a;
		}
		return result;
	}
	
	static int product(int b , int ...arrr)
	{
		int multi = b;
		// we made b compulsory
		for(int c : arrr)
		{
			multi *= c;
		}
		return multi;
	}
	public static void main(String[] args) {
		
		int twosum = sum(4,5);
		int threesum = sum(90,87,69);
		System.out.println(twosum);
		System.out.println(threesum);
		
		int onepro = product(4);
		int twopro = product(4,5);
		System.out.println(onepro);
		System.out.println(twopro);
		
	}

}
