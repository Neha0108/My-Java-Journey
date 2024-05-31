package com.oops;

// Abstract means only exist in thought which is in mind but not implemented till now
// Abstract class means a class which includes abstract methods

abstract class Parent1
{
	Parent1()
	{
		System.out.println("mai parent hu");
	}
	public void warning()
	{
		System.out.println("WARNINGGGG");
	}
	abstract public void warm();
	abstract public void harm();
}
class Child01 extends Parent1
{
	@Override
	public void warm() 
	{
		System.out.println("WARMINGSS");
	}

	@Override
	public void harm() {
		// TODO Auto-generated method stub
		
	}
}
class Child02 extends Parent1
{

	@Override
	public void warm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void harm() {
		// TODO Auto-generated method stub
		
	}
}
abstract class Child03 extends Parent1
{
	// if we do inheritance in two abstract class then we dont need to implement abstract methods
}

// abstract class sets standard that you have to implement abstract methods for inheritance
// we cannot make object of abstract class
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//----Parent1 obj = new Parent1();----error--//
		Parent1 obj = new Child01();
		obj.warning();
		obj.warm();
	}

}
