package com.basics;

import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "Neha";
		//String batch = sc.next();
		System.out.println(name);
		//System.out.println(batch);
		
		/*
		 some commonly used string methods
		 length()    
		 toLowerCase()   toUpperCase()
		 trim()
		 */
		int value = name.length();
		System.out.println(value);
		
		String NAME = name.toUpperCase();
		System.out.println(NAME);
		
		String newname = name.toLowerCase();
		System.out.println(newname);
		
		String trimmed = "     neha";
		System.out.println(trimmed.trim());
		System.out.println(trimmed);
		
		System.out.println(name.substring(1));
		System.out.println(trimmed.substring(3, 7));
		System.out.println(name.substring(1,3));
		
		System.out.println(trimmed.replace('e','i'));
		System.out.println(name.replace("Neh","hen"));
		
		System.out.println(trimmed.startsWith(" "));
		System.out.println(trimmed.endsWith("ha"));
		System.out.println(trimmed.charAt(5));
		System.out.println(trimmed.indexOf('h'));
		
		System.out.println(name.indexOf("a",4));
		
		System.out.println(name.equals("neha"));
		System.out.println(name.equalsIgnoreCase("nEHa"));
		
		//-- ESCAPSE SEQUENCE CHARACTERS --//
		/*
		 "\n" --newline
		 "\t" --tab
		 "\'" -- single quote
		 "\"" -- double quote
		 "\\" backslash
		 */
		
		
		
		

	}

}
