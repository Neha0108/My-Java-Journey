package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int stone = 0;
		int scissor = 1;
		int paper = 2;
		
		System.out.println("enter : 0 for stone");
		System.out.println("enter : 1 for scissor");
		System.out.println("enter : 2 for paper");
		int input = sc.nextInt();
		System.out.printf("user's choice: %d \n", input);
		
		int ranNumber = ran.nextInt(3);
		System.out.println("computer's choice: " + ranNumber);
		
		int i = 4;
		//for(int i = 0; i >0;i++) {
		while(i>1)
		{
		if(ranNumber == input)
		{
			System.out.println("Draw");
		}
		else if(ranNumber == 0 && input == 1)
		{
			System.out.println("computer wins");
		}
		else if(ranNumber == 1 && input == 2)
		{
			System.out.println("computer wins");
		}
		else if(ranNumber == 2 && input == 0)
		{
			System.out.println("computer wins");
		}
		else if(input == 0 && ranNumber == 1)
		{
			System.out.println("user wins");
		}
		else if(input == 1 && ranNumber == 2)
		{
			System.out.println("user wins");
		}
		else if(input == 2 && ranNumber == 0)
		{
			System.out.println("user wins");
		}
		else
		{
			System.out.println("invalid input");
		}
		
	}}

}
 