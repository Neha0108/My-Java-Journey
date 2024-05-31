package com.basics;

public class Methods {
	// to make program efficient and reusable we use small blocks of code
	// DRY = DO NOT REPEAT YOURSELF
	// static keyword is used to associate a method of given
	// class with the class rather than the object
	
	public static int sum (int a , int b)
	{
		int c = a+b;
		return c;  // return type
		}
	
	//  method without return type
	static void product (int x, int y)
	{
		int z = x*y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		// calling method with return type
		int ans = sum(4,5);
		System.out.println(ans);
		
		// calling method without return type
		product(7,6);
		
		/* calling a method
		 * Methods obj = new Methods();
		 * obj.sum(4,5);
		 */
		Methods obj = new Methods();
		obj.product(7,7);
		
	}

}
