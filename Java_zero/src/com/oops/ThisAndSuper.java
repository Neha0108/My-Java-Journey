package com.oops;

// this keyword is a way for us to refer an
// object of the class which is being created/referenced 
class Ekclass
{
	int a;
	int c;
	
	Ekclass(int a, int c)
	{
		this.a = a;
		this.c = c;
	}
	public int geta()
	{
		return a;
	}
	
	Ekclass(int v)
	{
		a = v;
		System.out.println(v);
	}
	public int returnone()
	{
		return c;
	}
}

class Doclass extends Ekclass
{
	int x;
	Doclass(int x)
	{
		super(x);
		System.out.println(x*x);
	}
}
//super keyword is used to refer immediate parent class object
public class ThisAndSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ekclass obj = new Ekclass(6,7);
		// System.out.println(obj.geta());
		// System.out.println(obj.returnone());
		Doclass obj1 = new Doclass(4);
		
		obj1.returnone();
		
		}
}
