package com.bridgelabz.functionalProgram.programs;

import java.util.Scanner;

import com.bridgelabz.functionalProgram.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=scanner.nextInt();
		System.out.println("Enter the value of b : ");
		int b=scanner.nextInt();
		System.out.println("Enter the value of c : ");
		int c=scanner.nextInt();
		
		Utility.quadratic(a, b, c);
	}
}
