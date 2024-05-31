package com.oops.practice;

class Circle
{
	public double radius;
	public double ar;
	public double peri;
	
	public Circle(double radius)
	{
		this.radius = radius;
		
	}
	public double area ()
	{
		ar = 3.14*radius*radius;
		return ar;
	}
	public double perimeter()
	{
		peri = 2*3.14*radius;
		return peri;
	}
}
class Cylind2 extends Circle
{
	public double height;
	
	Cylind2(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	public double tsa()
	{
		return 2 * 3.14 * radius * (radius + height);
	}
	
	public double lsa()
	{
		return 2 * 3.14 * radius * height;
	}
}

public class Inheritance_practice {
	public static void main(String[] args)
	{
		Circle obj = new Circle(8);
		System.out.println(obj.area());
		System.out.println(obj.perimeter());
		Circle obj2 = new Cylind2(5,7);
		((Cylind2) obj2).tsa();
		System.out.println(((Cylind2) obj2).tsa());
	}
}
