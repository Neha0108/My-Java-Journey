package com.oops;
// parent class or superclass
class Base
{
	int x;
	Base()
	{
		System.out.println("hi i am a constructor");
	}
	
	public int getx()
	{
		return x;
	}
	public void setx(int x)
	{
		System.out.println("i am setting x now: ");
		this.x = x;
		
	}
}

// child class or subclass
class Child extends Base  // using extends keyword for applying inheritence
{
	int y;
	
	Child()
	{
		System.out.println("hi");
	}
	public int gety()
	{
		return y;
	}
	public void sety(int y)
	{
		this.y = y;
	}
}

// main class
public class Inheritance {
	
// Inheritance is used to borrow properties and methods from an existing class
// we have to make object of child or derived class to access base class properties
// if we make object of parent class then we can't access child class properties
// bcoz child class is inheriting properties of parent class 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child b = new Child();
		b.setx(5);
		System.out.println(b.getx());
		b.sety(6);
		System.out.println(b.gety());
		
	}
	}
