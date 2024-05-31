package com.basics;

import java.util.Scanner;

public class Strings {

	/*
	 String is a class but also act as non - primitive data-type
	 String is a sequence of characters
	 Strings are immutable (cannot be changed)
	 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = "neha";
		System.out.print(name);
		System.out.println(name); // move to new line after printing name
		System.out.printf(name);
		//System.out.print(name);
		
		int a = 6;
		float b = 5.653f;
		System.out.printf("\n value of a is %d and value of b is %f",a  ,  b);
		// %d , %c , %f , %s are format specifiers
		System.out.format("\n value of a is %d and value of b is %f ",a  ,  b);

		System.out.printf("\n %8.3f",b );
		//8.3 spaces before printing value of b 


	}

}
