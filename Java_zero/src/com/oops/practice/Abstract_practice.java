package com.oops.practice;

abstract class Pen
{
	abstract void write1();
	abstract void refill();                 
}
class FountainPen extends Pen
{
	void changeNib()
	{
		System.out.println( "nip changed");
	}
	@Override
	void write1() {
		// TODO Auto-generated method stub
		System.out.println("hi ! i am fountain");
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("fountain is refilled");
	}
	
}
public class Abstract_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen p = new FountainPen();
		p.changeNib();
		p.refill();
	}

}
