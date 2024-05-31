package com.practice;
import java.util.Scanner;
public class Ifelse_practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		if(a == 9)
		{
			System.out.println("hi!!");
		}
		else {
			System.out.println("bye!!");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MARKS FOR 3 SUBJECTS");
		float maths = sc.nextFloat();
		float english = sc.nextFloat();
		float science = sc.nextFloat();
		
		float result = (maths+english+science)/300;
		float percentage = result*100;
		
		float mathsper = maths/100 *100;
		float englishper = english/100 *100;
		float scienceper = science/100 *100;
		
		if( mathsper >= 33 && englishper >= 33 && scienceper >=33 && percentage >= 40)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}

}
