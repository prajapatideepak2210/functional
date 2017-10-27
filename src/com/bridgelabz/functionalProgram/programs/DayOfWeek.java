package com.bridgelabz.algorithms.dayofweek;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year=sc.nextInt();
		System.out.println("Enter the Month : ");
		int month=sc.nextInt();
		System.out.println("Enter the day : ");
		int day=sc.nextInt();
		
		int y= year-(14-month)/12;
		int x= y + (y/4) - (y/100) + (y/400); 
		int m=month + 12 * ((14 - month)/12) - 2;
		int d=(day + x + (31*m) / 12) % 7;
		
		switch(d)
		{
		default :
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		}
	}
}
