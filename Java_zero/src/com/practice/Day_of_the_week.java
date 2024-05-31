package com.practice;

import java.util.Scanner;
public class Day_of_the_week {
	
	public static String findDayOfWeek(int dayNumber) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Adjusting for numbers greater than 7
        dayNumber = (dayNumber - 1) % 7;
        return daysOfWeek[dayNumber];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();

		switch(day)
		{
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("wednesday");
		case 4 -> System.out.println("thursday");
		case 5 -> System.out.println("friday");
		case 6 -> System.out.println("saturday");
		case 7 -> System.out.println("sunday");
		}
		
		String dayOfWeek = findDayOfWeek(day);
        System.out.println("Day of the week for number " + day + " is " + dayOfWeek);
    
}
}

