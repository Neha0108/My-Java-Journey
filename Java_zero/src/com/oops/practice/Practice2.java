package com.oops.practice;

class Reactangle
{
	public int length;
	public int breadth;
	
	Reactangle(int l , int b)
	{
		length = l;
		breadth = b;
	}
	public int area()
	{
		System.out.println(length);
		System.out.println(breadth);
		return length*breadth;
	}
}

class Cuboid extends Reactangle
{
	public int width;
	
	Cuboid(int l, int b,int w)
	{
		super(l,b);
		width = w;
	}
	
	public int area(int l,int b, int w)
	{
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(width);
		return b*w;
		
	}
}
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reactangle obj = new Reactangle(56,89);
		//System.out.println(obj.area());
		Reactangle obj1 = new Cuboid(8,9,6);
		System.out.println(obj1.area());
	}

}
