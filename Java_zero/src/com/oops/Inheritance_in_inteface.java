package com.oops;

interface Sample
{
	public void greetings();
}
interface Sample1 extends Sample
{
	public void meetings();
}
class Iii implements Sample1
{

	@Override
	public void greetings() {
		// TODO Auto-generated method stub
		System.out.println("heheh");
	}

	@Override
	public void meetings() {
		// TODO Auto-generated method stub
		System.out.println("huhuh");
	}
	
}
public class Inheritance_in_inteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample1 obj = new Iii();
		Iii obj = new Iii();
		obj.greetings();
		obj.meetings();
	}

}
