package com.oops;

// lifecycle of thread -- new > runnable > running > terminated
class MyThread1 extends Thread
{
	@Override
	public void run() {
		while(true) {
			System.out.println("i am cooking");
		}
	}
	
}
class MyThread2 extends Thread
{
	@Override
	public void run() {
		while(true) {
			System.out.println("i am serving");
		}
	}
	
}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		//t1.run();
		//t2.run();
		t1.start();
		t2.start();
	}

}
