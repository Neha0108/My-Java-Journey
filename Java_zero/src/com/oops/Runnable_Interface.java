package com.oops;

class MyRunnable1 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("hi");
		}
/*		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		*/
	}
}
class MyRunnable2 implements Runnable
{
	public void run()
	{
		while(true) {
			System.out.println("bye");
		}
/*		
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		*/
	}
}
public class Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable1 bullet1 = new MyRunnable1();
		Thread gun1 = new Thread(bullet1);
		
		MyRunnable2 bullet2 = new MyRunnable2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
	}

}
