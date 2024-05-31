package com.oops;

class  Myemploy
{
	private int id;
	private String name;
	
	public Myemploy()
	{
		id = 45;
		name = "nehu";
	}
	public Myemploy(String myname, int myid)
	{
		id = myid;
		name = myname;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
		System.out.println("my name is " + name);
	}
	public void setid(int m)
	{
		id = m;
		System.out.println("my name is " + id);
	}
	public int getid()
	{
		return id;
	}
}

public class Construct {

	public static void main(String[] args) {
		
		/* 
		Myemploy obj = new Myemploy();
		already assigned value in constructor will be printed
		System.out.println(obj.getid());
		System.out.println(obj.getName());
		passing values
		obj.setName("neha");
		obj.setid(46);
		after passing values
		System.out.println(obj.getid());
		System.out.println(obj.getName());
		*/
		
		
		// parameterized constructor
		Myemploy obj = new Myemploy("lamba",89);
		System.out.println(obj.getid());
		System.out.println(obj.getName());
	}

}
