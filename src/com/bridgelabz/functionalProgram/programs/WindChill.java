package com.bridgelabz.functionalProgram.programs;

import java.util.Scanner;

import com.bridgelabz.functionalProgram.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of temprature which should be less then 50 : ");
		double temprature=scanner.nextDouble();
		System.out.println("Enter the value of wind speed which should be less then 120 : ");
		double speed=scanner.nextDouble();
		
		double windchill=Utility.windchill(temprature, speed);
		System.out.println("Wind Chill is : "+windchill);
	}
}
