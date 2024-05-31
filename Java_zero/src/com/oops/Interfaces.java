package com.oops;

// interface is a point where two systems meet/interact or communicate
// example tv and human via tv-remote; keyboard in laptop    
// we use implement keyword
interface Bicycle
{
	void applybrake(int decrement);
	void speedup(int increment);
}
class Nehacycle implements Bicycle
{
	int speed = 8;

	@Override
	public void applybrake(int decrement)
	{	
		int num = speed;
		num = num - decrement;
		System.out.println(speed);
	}

	@Override
	public void speedup(int increment)
	{
		speed = speed + increment;
		System.out.println(speed);		
	}
}
public class Interfaces {
	
/// ------- we can't extend multiple abstract classes
/// ------- but we can implement multiple interfaces at a time
/// ------- can also assign reference object to interface	
	
	public static void main(String[] args) {
	
		Bicycle obj = new Nehacycle();
//      obj.speed = 4; -- we cannot modify a variable which is initialized in interface
		obj.applybrake(7);
		obj.speedup(1);
	}

}
