package com.bridgelabz.algorithms.squareroot;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        double num= sc.nextDouble();
        squareRoot(num);
	}
	public static void squareRoot(double num)
	{
		double t=num;
        double epsilon= 1e-15;
        while(Math.abs(t-(num/t))>(epsilon*t)){
            t=((num/t)+t)/2;
        }
        System.out.println("Square Root = "+t);
	}
}
