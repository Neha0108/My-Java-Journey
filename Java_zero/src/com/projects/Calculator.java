package com.projects;

// performing operations on two numbers
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
		System.out.println("enter the operation which u want to perform!");
		System.out.println("choose 1, 2, 3, 4 :");
		System.out.println(" 1. add \n 2. subtract \n 3. product \n 4. divide");
		double operator , n1, n2 ;
		double result = 0;
		operator = sc.nextDouble();
		
		System.out.println("enter values for n1 and n2:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
				
		if(operator == 1)
		{
			result = n1 + n2;
		}
		else if(operator == 2)
		{
			result = n1 - n2;
		}
		else if(operator == 3)
		{
			result = n1*n2;
		}
		else {
			result = n1/n2;
		}
		System.out.println("result is: " + result);
		}
	}
}