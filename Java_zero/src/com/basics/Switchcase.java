package com.basics;

import java.util.Scanner;
public class Switchcase {
	/*
	 * used when we have to make choices between 
	 * number of alternatives for a given variable
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		switch(age)
		{
		case 18:
			System.out.println("hi 18");
			break;
		case 19:
			System.out.println("hi 19");
			break;
		case 20:
			System.out.println("hi 20");
			break;
		default:
				System.out.println("hi!");
		}
		// break is used to exit from loop otherwise it will
		//print every statement after condition comes true
		switch(age)
		{
		case 18:
			System.out.println("hi 18");
		case 19:
			System.out.println("hi 19");
		case 20:
			System.out.println("hi 20");
		default:
				System.out.println("hi!");
		}
		
		//-- ENHANCED SWITCH --//
		String var = sc.next();
		
		switch(var)
		{
		case "neha" -> System.out.println("hi neha");
		case "nehu" -> System.out.println("hi nehu");
		case "niha" -> System.out.println("hi niha");
		default -> System.out.println("hi!");
		}
	}

}
