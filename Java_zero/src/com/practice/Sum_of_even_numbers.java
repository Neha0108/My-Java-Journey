package com.practice;

public class Sum_of_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		int total = 0;
		int n = 0;
		
		while(i<10)
		{
			sum += 2*i;
			i++;			
		}
		System.out.println(sum);
		
		while(n<10)
		{
			total += 2*(n + 1);
			n++;			
		}
		System.out.println(total);
		
		
	}

}
