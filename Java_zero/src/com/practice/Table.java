package com.practice;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multiplication
		int m = 0;
		while(m<10)
		{
			//System.out.println("4*" + m + "=" + 4*m );
			System.out.printf("4x%d = %d \n", m , 4*m);
			m++;
		}
				
			//table in reverse
			int v ;
			int sum = 0;
			for(v = 10; v>0; v--)
			{
	    		System.out.printf("8x%d = %d \n", v , 8*v);
				sum+= 8*v;					
			}
			System.out.println(sum);

				
	}

}
