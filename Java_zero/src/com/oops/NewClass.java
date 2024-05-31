package com.oops;
// we can create two or more objects for one custom classs
class Employee // noun
{
	int id; //adjective -- attributes
	String name; // adjective -- attributes
	int salary;
	public void details()
	{
		System.out.println("my id is " + id);
		System.out.println("my name is " + name);
		System.out.println("my salary is " + salary);
	}
}

public class NewClass {

	public static void main(String[] args)
	{
		System.out.println("this is my custom class");
		Employee obj = new Employee(); //  instantiation
		// setting values into attributes
		obj.id = 123;
		obj.name= "neha";
		obj.salary = 90;
		// printing attributes
		System.out.println("my id is " + obj.id);
		System.out.println("my name is " + obj.name);
		System.out.println("my salary is " + obj.salary);
		// calling method --  reduce code length
		obj.details();
		
		// for another employee
		Employee obj2 = new Employee();
		obj2.id = 456;
		obj2.name = "arin";
		obj2.salary = 80;
		obj2.details();
	}
}
