package com.oops;

class Base1
{
	Base1()
	{
		System.out.println("i am a constructor");
	}
	Base1(int x)
	{
		System.out.println("i an overloaded constructor with value of x as: " + x);
	}
}
class Derived extends Base1
{
	Derived()
	{
		System.out.println("i am deived class constructor");
	}
	Derived(int x,int y)
	{
		super(x);
		System.out.println("i am an overloaded derived constructor with value of y as: " + y);
	}
}
class ChildofDerived extends Derived
{
	ChildofDerived(int x, int y,int z)
	{
		super(x,y);
		System.out.println("i am an childofderived constructor with value of z as: " + z);
	}
	
}
public class Cons_in_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base b = new Base(); 
		//Derived d = new Derived();
		//Derived c = new Derived(10,5);
		ChildofDerived cd = new ChildofDerived(4,6,7);
	}
	

}
