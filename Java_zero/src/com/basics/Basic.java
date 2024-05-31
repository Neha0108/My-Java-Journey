package com.basics;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum of three numbers:");
		int a  = 9;
		double b = 9.087;
		float c = 7.98f;
		char ch = 'N';
		String name = "neha";
		long e = 8765;
		System.out.println(a+b+c);
		System.out.println(ch + " " + name + " " + e);
		boolean f = false;
		System.out.println(f);
		
		//----TAKING INPUT FROM USER ---//
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println(i);
		
		
	}

}
