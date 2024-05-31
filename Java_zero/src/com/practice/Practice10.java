package com.practice;
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what you want odd or even");
		String str1 = sc.next();
		System.out.println(str1);
		
		if(str1.equals("odd"))
		{
			int x = sc.nextInt();
			System.out.println(x%2!=0);
		}
		else
		{
			int y = sc.nextInt();
			System.out.println(y%2==0);
		}
	}

}
