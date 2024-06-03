package com.oops.practice;

interface Camera
{
	void takeSnap();
	void recordVideo();
}
interface Wifi
{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MycellPhone
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
class MySmart extends MycellPhone implements Wifi, Camera
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
		System.out.println("connecting to" + network);
	}
}

class Interface_practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmart sm = new MySmart();
		String[] ar = sm.getNetworks();
		for(String item: ar)
		{
			System.out.println(item);
		}
	}

}
