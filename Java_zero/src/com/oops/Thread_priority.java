package com.oops;
/*
 	min_priority = 1
 	norm_priority = 5 -- by default priority
 	max_priority = 10
 */

class MyThr1 extends Thread
{
	public MyThr1(String name) 
	{
		super(name);
	}
	public void run()
	{
		int i = 34;
		while(true)
		{
		System.out.println("thank you " + getName() );
		}
	}
}

public class Thread_priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr1 t1 = new MyThr1("neh1");
		MyThr1 t2 = new MyThr1("neha2");
		MyThr1 t3 = new MyThr1("nehaa3");
		MyThr1 t4 = new MyThr1("nehaaa4");
		MyThr1 t5 = new MyThr1("nehaaaa5");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
