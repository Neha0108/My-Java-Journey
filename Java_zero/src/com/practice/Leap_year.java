package com.practice;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year to be checked:");
		int year = sc.nextInt();
		
		if(year % 100 != 0 || year % 2 == 0 && year % 400 == 0 )
		{
			System.out.println("yes it is a leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		}

}
