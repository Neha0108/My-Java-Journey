package com.basics;

public class Operators {

	/*
	 PRECEDENCE AND ASSOCIATIVITY OF OPERATORS
	 int a = 6*5-34/2;
	  compiler will solve equation in this sequence
	  (*,/) > (+,-)
	 Associativity tells the direction of execution of operators 
	 + / - *    left to right 
	 ++ ==      right to left
	 
	 logical opeartors associativity left to right
	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//---ASSIGNMENT OPERATORS---//
		int a = 4; // = assignment operator
		int b = 6 % a; // modulo remainder operator
		int c = a*b; // * multiplication
	    float d = a/b; // division
	    int e = +a;  // 
	    int f = -a; // 
	    int g = ++a; // pre-increment operator  
	    int h = a++; // post-increment operator
	    int i = --a; // pre-decrement operator
	    int j = a--; // post-decrement : decrement in value of num after using it in an expression
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		//---COMPARISON OPERATOR---//
		System.out.println(a==j);
		System.out.println(a>=b);
		System.out.println(j<=a);
		System.out.println(f<a);
		System.out.println(j>b);
		
		//---LOGICAL OPERATOR---//
		// &&   AND OPERATOR  evaluates when both conditions are true
		// ||   OR OPERATOR  evaluates when at least one condition is true
		// !    NOT OPERATOR evaluates when condition is true
		
		float result = 45 - 5 * 6 / 7 + 4;
		System.out.println(result);
		
		int result1 = 60*5 + 70/5;
		int result2 = 60/5 + 70*5;
		
		System.out.println(result1);
		System.out.println(result2);

		
		
	}

}
