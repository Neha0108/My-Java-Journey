package com.oops;

class MyEmployee
{
	private int id;
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
		System.out.println("my name is " + name);
	}
	public int getid()
	{
		return id;
	}
}
public class Access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee obj = new MyEmployee();
		
	//	-- throws error bcoz they are private
		//obj.id = 123; 
		//obj.name = "neha";
		obj.setName("neha");
		System.out.println(obj.getName());
	}

}
