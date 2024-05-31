package com.practice;

public class Practice9 {
	public static void main (String[] args)
	{
		String str = "  neha";
		System.out.println(str.replace(" ","_"));
		
		String letter = "\"Dear <|name|>, Trans a lot \"";
		System.out.println(letter.replace("<|name|>","sone name"));
		System.out.println(letter);
		
		String str2 = "   neha   lamba  ";
		System.out.println(str2.indexOf("  "));
		System.out.println(str2.indexOf("   "));
		System.out.println(str2.indexOf(" "));
		
		System.out.println("Dear Harry,\nThis Java Course is nice.\nThanks");
	}

}
