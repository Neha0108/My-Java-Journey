package com.oops;
import java.io.File;
public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");
		
		if(file.exists())
		{
			System.out.println("that file exits! ");
		}
		else {
			System.out.println("that file does'nt exist");
		}
		
		
	}

}
