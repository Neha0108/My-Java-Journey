package com.practice;
import java.util.Scanner;
public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = "com";
		String str2 = "org";
		String str3 = "in";
		
		System.out.println("enter your mail");
		String email = sc.next();
		// we can also use email.endswith() method
		if(email.contains(str1))
		{
			System.out.println("commercial website");
		}
		else if (email.contains(str2))
		{
			System.out.println("organization website");
		}
		else if(email.contains(str3))
		{
			System.out.println("indian website");
		}
		else
		{
			System.out.println("not identical");
		}
	}

}
