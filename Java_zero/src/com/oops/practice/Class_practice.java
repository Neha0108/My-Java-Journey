package com.oops.practice;

class Employee
{
	int salary;
	String name;
	
	public int getsalary()
	{
		return salary;
	}
	public String getname()
	{
		return name;
	}
	public String setname()
	{
		name = "nehu";
		return name;
	}
}
class Cellphone
{
	public void ring()
	{
		System.out.println("Ringing.....");
	}
	public void vibrating()
	{
		System.out.println("Vibrating.....");
	}
}
class Square
{
	int side;
	public int length(int n )
	{
		side = n;
		return side;
	}
	public void area()
	{
		System.out.println("area of square is: " + side*side);
	}
	public void perimeter()
	{
		System.out.println("perimeter of square is: "+ 4*side);
	}
	
}
public class Class_practice {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.salary = 80;
		obj.name = "neha";
		System.out.println(obj.getsalary());
		System.out.println(obj.getname());
		System.out.println(obj.setname());
		
		Cellphone obj2 = new Cellphone();
		obj2.ring();
		obj2.vibrating();
		
		Square obj3 = new Square();
		System.out.println("side of square is: " + obj3.length(9));
		obj3.area();
		obj3.perimeter();
		
	}

}
