package com.bridgelabz.algorithms.bubbleSort;

import java.util.Scanner;

public class BubbleSortForInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the How many Numbers you want to insert : ");
		int num=sc.nextInt();
		System.out.println("Enter "+num+" numbers : ");
		int[] list=new int[num];
		for(int i=0; i<num; i++)
		{
			list[i]=sc.nextInt();
		}
		// UnSorted list
		System.out.println("======================================");
		System.out.print("UnSorted List : ");
		for(int i=0; i<num; i++)
		{
			System.out.print(list[i]+" ");
		}
		
		//Sorted List
		System.out.println("\n====================================");
		System.out.print("Sorted List : ");
		int temp;
		for(int i=0; i<num-1; i++)
		{
			for(int j=i+1; j<num; j++)
			{
				if(list[i]>list[j])
				{
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		for(int i=0; i<num; i++)
		{
			System.out.print(list[i]+" ");
		}
	}
}
