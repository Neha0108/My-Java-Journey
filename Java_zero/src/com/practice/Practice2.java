package com.practice;
import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter value to check whether it is int or not");
		boolean b1 = input.hasNextInt();
		System.out.println("result: " + b1);
	}
}
