package com.practice;
import java.util.Scanner;
public class Practice4 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter marks of five subjects");
		int maths = input.nextInt();
		int english = input.nextInt();
		int biology = input.nextInt();
		int chemistry= input.nextInt();
		int physics = input.nextInt();
	
		float sum = maths+english+biology+chemistry+physics;
		System.out.println("total marks out of 500: " + sum);
		
		float percentage = sum/500;
		System.out.println("percentage of a student: " + percentage*100);
		
	}

}
