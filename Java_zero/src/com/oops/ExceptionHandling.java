package com.oops;

import java.util.Scanner;

// -- Errors and Exception Handling -- //
/*
 *  syntax error --> like variable not declared, semicolon, uneven braces 
 *  logical error --> when a program or set of code runs but deliver wrong output 
 *  runtime error --> called exceptions 
 * 	runtime error occurs when jvm executes code and during this execution error occur
 * -- site crash 
 * -- encountered by users
 * -- wrong data fetched
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logical error -- print even numbers from 1 to 18
		for(int i =0;i<=10;i++ )
		{
			System.out.println("even number: " + 2*i);
		}
		// also printing 0 and 20
		
		for(int i =1;i<=9;i++ )
		{
			System.out.println("even number: " + 2*i);
		}
		
		// runtime error
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println("integer part of 10000 divided by k is " + 10000/k);
		
	}

}
