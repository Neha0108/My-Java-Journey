package com.basics;

public class Whileloop {

	/*
	 * while (boolean condition)
	 * {
	 *    statement;
	 *    jab tk condition false nhi hogi tb tk
	 *    loop chlta rhega
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		// jab tak i  less then three hai tb tk i print hota rhega
		
		while (i<=3) // true condition
		{
			System.out.println(i);
			i++;
		}
		// first i = 0 then print i then i incremented 
		System.out.println("finish running while loop!");
		
		/*while(true)
		{
			System.out.println("infinite while loop");
		}
		*/
	}

}
