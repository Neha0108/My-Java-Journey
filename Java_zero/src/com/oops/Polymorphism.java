package com.oops;
// when a single real world object perform one or more tasks 
// eg1. a man can be a father, son, employee, programmer
// eg2. smartphone can be camera, cellphone, gps, media player
interface Camera1
{
	void takeSnap();
	void recordVideo();
	default void record4kVideo()
	{
		System.out.println("....RECORDING....");
	}
}
interface Wifi1
{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MycellPhone1
{
	void cellNumber(int pno)
	{
		System.out.println("Calling" + pno);
	}
	void pickCall()
	{
		System.out.println("connecting.....");
	}
	
	
}
class MySmart1 extends MycellPhone1 implements Wifi1, Camera1
{
	@Override
	public void takeSnap()
	{
		System.out.println("taking snap");
	}
	@Override
	public void recordVideo()
	{
		System.out.println("recording video");
	}

	@Override
	public String[] getNetworks() 
	{
		System.out.println("getting list of networks");
		String[] networkList = {"abc","def","ghi"};
		return networkList;
	}
	@Override
	public void connectToNetwork(String network) 
	{
		System.out.println("connecting to " + network);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
//--- when you want someone to only use camera in your smartphone ---//
		Camera1 cam1 = new MySmart1();
		// calling camera default fun
		cam1.record4kVideo();
		
		MySmart1 sm = new MySmart1();
		sm.connectToNetwork("def");
		sm.pickCall();
	}

}
