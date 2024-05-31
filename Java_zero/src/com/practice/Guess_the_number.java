package com.practice;
import java.util.Random;
import java.util.Scanner;

class Game{
	
	public int number;
	public int inputnumber;
	public int noofguesses = 0;
	Game()
	{
		Random ran = new Random();
		this.number = ran.nextInt(100); 
	}
	
	public int getnofguesses()
	{
		return noofguesses;
	}
	
	public void setnofguesses(int noofguesses )
	{
		this.noofguesses = noofguesses;
	}
	
	public int userinput()
	{
		System.out.println("guess the number");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
		return inputnumber;
	}
	
	boolean isCorrect()
	{
		if(inputnumber == number)
		{
			return true;
		}
		else if (inputnumber<number)
		{
			System.out.println("too less");
		}
		else if (inputnumber>number)
		{
			System.out.println("too high");
		}
		return false;
		
	}
}
public class Guess_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		boolean b = false;
		while(!b) 
		{
		g.userinput();
		b = g.isCorrect();
		System.out.println(b);
		}
	}
}
