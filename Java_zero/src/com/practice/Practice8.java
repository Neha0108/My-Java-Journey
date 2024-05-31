package com.practice;
import java.util.Scanner;
public class Practice8 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float v = input.nextInt();
		float u = input.nextInt();
		float a = input.nextInt();
		float s = input.nextInt();
		
		float result = (v*v - u*u)/(2*a*s);
		System.out.println(result);
		
		
		
	}
}
