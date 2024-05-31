package com.oops.practice;

class Cylinder
{
	private int radius;
	private int height;
	
	Cylinder()
	{
		radius = 10;
		height = 12;
		
	}
	int getradius() {
		return radius;
	}
	
	void setradius (int n )
	{
		radius = n;
		System.out.println(radius);
	}
	
	int getheight() {
		return height;
	}
	
	void setheight (int m )
	{
		height = m;
		System.out.println(height);
	}
	
	void operation()
	{
		double area = 2*3.14*radius*(radius+height);
		System.out.println(area);
		double volume = 2*3.14*radius+height;
		System.out.println(volume);
	}
}
class Rectangle
{
	public Rectangle()
	{
		int l = 9;
		int b = 7;
	}
	public Rectangle(int l,int b)
	{
		System.out.println(l);
		System.out.println(b);
	}
}
public class Cons_acess_practice {
	
	public static void main(String[] args)
	{
	Cylinder obj = new Cylinder();
	System.out.println(obj.getradius());
	System.out.println(obj.getheight());
	obj.setradius(3);
	obj.setheight(7);
	obj.operation();
	
	Rectangle obj2 = new Rectangle(5,6);
	}
}
