package com.oops;

class Name
{
	public String name;
	public String surname;
	
	public Name()
	{
		name = "neha";
		surname = "lamba";
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Name
{
	public int sid;
	public String sname;
	
	public Student()
	{
		sid = 10509;
		sname = "nehu";
	}
	
	public String getName()
	{
		return sname;
	}
}

public class Method_overriding_inheritance {
	public static void main (String[] args) 
	{
		
		Name obj1 = new Name();
		System.out.println("my name is " + obj1.getName());

		Name obj2 = new Student();
		System.out.println("my name is " + obj2.getName());
		
// this is known as dynamic method dispatch and is used to achieve
//		run time polymorphism in java
	}
}
