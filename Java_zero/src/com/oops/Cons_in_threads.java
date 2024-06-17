package com.oops;

class MyThr extends Thread
{
	public MyThr(String name) 
	{
		super(name);
		System.out.println("name: " + name);
	}
	public void run()
	{
		for(int i = 0; i<5; i++)
		{
		System.out.println("helllo guyz!!!!");
		}
	}
}

public class Cons_in_threads {

	public static void main(String[] args) {
		
		MyThr t = new MyThr("neha");
		System.out.println(t.getState());
		t.start();
		System.out.println("the id of this thread is: " + t.getId());
		System.out.println(t.getName());
		System.out.println(t.getState());

	}

}
