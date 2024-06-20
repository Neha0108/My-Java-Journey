package com.oops;

// exception handling using try catch block
// checked (compile time exceptions) and unchecked exception ( runtime exceptions)
// common exceptions --- null pointer, arithmetic, arrayboundoutofindex, illegal argument, number formatting
public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 0;
		
		//int c = a/b;
		//System.out.println("the result is " + c );
		// will give arithmetic error
		
		try 
		{
			int c = a/b;
			System.out.println("the result is " + c);
		}
		catch(Exception e)
		{
			System.out.println("we failed to get the result because ");
			System.out.println(e);
		}
		
		// HANDLINF SPECIFIC EXCEPTIONS
		int arr[] = {1,2,3,4};
		int brr[] = {4,5,6,7};
		try
		{
			int sum = arr[2] + brr[5];
			System.out.println(sum);
		}
		catch(Exception var){
			System.out.println(var);
			
		}
			
	}

}
