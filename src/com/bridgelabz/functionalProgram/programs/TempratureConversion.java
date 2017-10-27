package com.bridgelabz.algorithms.temprature;

import java.util.Scanner;

public class TempratureConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature : ");
		double temp=sc.nextDouble();
		
		System.out.println("Enter 1 to F to C conversion and 2 to C to F conversion :");
		int choise=sc.nextInt();
		conversion(choise, temp);
	}
	
	public static void conversion(int choise,double temp)
	{
		if(choise==1)
		{
			double tempratureInCelsius=(((temp-32)*5)/9);
			System.out.println("Temprature in Celsius : "+tempratureInCelsius);
		}
		else if(choise==2)
		{
			double tempratureInFahrenheit=(((temp*9)/5)+32);
			System.out.println("Temprature in Fahrenheit : "+tempratureInFahrenheit);
		}
		else
		{
			System.out.println("Please choose correct nomber.");
		}
	}
}
