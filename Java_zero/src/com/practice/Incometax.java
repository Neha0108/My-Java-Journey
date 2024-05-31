package com.practice;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your annual income in lakhs");
		float annual_income = sc.nextFloat();
		System.out.println(annual_income);
		System.out.println("in lakhs " + annual_income*100000);
		
		if(annual_income >= 2.5 && annual_income < 5.0)
		{
			System.out.println("you have to pay tax 5 %");
		}
		else if (annual_income >= 5.0 && annual_income < 10.0)
		{
			System.out.println("you have to pay tax 20%");
		}
		else if (annual_income >= 10.0)
		{
			System.out.println("you have to pay tax 30%");
		}
		else
		{
			System.out.println("you dont have to pay taxes");
		}
		
		float tax = 0 ; 
		
		
		if(annual_income < 2.5)
		{
			tax = tax + 0;
		}
		else if(annual_income > 2.5 && annual_income < 5.0)
		{
			tax = tax + 0.05f*(annual_income - 2.5f);
		}
		else if(annual_income > 5.0 && annual_income <10.0)
		{
			tax = tax + 0.05f*(5.0f - 2.5f);
			tax = tax + 0.2f*(annual_income - 5.0f);
		}
		else {
			tax = tax + 0.05f*(5.0f - 2.5f);
			tax = tax + 0.2f*(10.0f - 5.0f);
			tax = tax + 0.3f* (annual_income - 10.0f);
		}
		System.out.println("tax you have to pay is: " +tax*100000);
	}

}
