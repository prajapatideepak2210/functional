package com.bridgelabz.functionalProgram.programs;

import java.util.Scanner;

import com.bridgelabz.functionalProgram.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first distance : ");
		double x=Math.pow(scanner.nextDouble(), 2);
		System.out.print("Enter the second disatance : ");
		double y=Math.pow(scanner.nextDouble(), 2);
		
		double distance=Utility.distance(x, y);
		
		System.out.println("Distance is = "+distance);
	}
}
