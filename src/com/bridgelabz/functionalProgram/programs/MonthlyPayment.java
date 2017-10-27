package com.bridgelabz.algorithms.monthlysalary;

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Yearly payment : \n");
		double p=sc.nextDouble();
		System.out.print("Enter the year : \n");
		double y=sc.nextDouble();
		System.out.println("Enter the rate of percent : \n");
		double r=sc.nextDouble();
		
		monthlySalary(p, y, r);
	}
	
	public static void monthlySalary(double p, double y, double r)
	{
		double n=12*y;
		double rate=r/(12*100);
		double x=1+rate;
		double x2=Math.pow(x, -n);
		double payment=p*rate/(1-x2);
		System.out.println("Your Monthly Salary is : "+payment);
	}
}
