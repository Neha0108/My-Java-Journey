package com.basics;

public class Methods_overloading {
/*
 * two or more methods can have same name but different number of parameters
 * method overloading cannot be performed by changing return type methods
 * When overloading methods in Java, you must change either the number or 
 * types of parameters, or both, but not just the return type.
 */
	public static void change(int a)
	{
		a = 67;
		System.out.println(a);
	}
	
	public static void change2(int[] arr)
	{
		arr[2] = 77;
	}
	
	
	static void name()
	{
		System.out.println("helllo neha ");
	}
	
	static void name(String name1)
	{
		System.out.println("hello " + name1);
	}
	
	static String name(String name2 , String name3)
	{
		return name2 + name3;
	}
	
	
	
	public static void main(String[] args) {		
		// changing integer value 
		// value will not be changed because copy of variable is passed 
		int x = 90;
		change(x);
		System.out.println("value of x after passing through change: " + x);
	
		// changing array value
		int[] marks = {43,67,87,45,21,90};
		change2(marks);
		System.out.println(marks[2]);
		// element will be changed because we are passing reference of object
		
		String name1 = "neha";
		String name2 = "nehaa";
		String name3 = "nehaaa";
		
		String name4 = name(name2,name3);
		name();
		name(name1);
		System.out.println(name4);
		}

}
