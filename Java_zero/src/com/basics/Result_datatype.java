package com.basics;

public class Result_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte x = 5;
		int y =6;
		short z = 76;
		long l = 7890;
		
		int a = y + x;
		float b = 6.54f + x;
		
		System.out.println(b);
		System.out.println(a);
		 
		// first print y then increment 
		// y = 7
		System.out.println(y++);
		
		// first increment y then print
		// y = 8
		System.out.println(++y);
		System.out.println(y);
		
		int m = 9;
		int n = ++m * 9;
		System.out.println(n);
		
		char ch = 'b';
		System.out.println(++ch);
		

	}

}
