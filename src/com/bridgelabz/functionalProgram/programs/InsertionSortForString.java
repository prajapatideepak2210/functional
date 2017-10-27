package com.bridgelabz.algorithms.insertionSortForString;

import java.util.Scanner;

public class InsertionSortForString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a String for sorting : ");
		String str1=sc.nextLine();
		String[] strArray=str1.split(" ");
		
		//Sorting
		String temp;
		for (int i = 1; i < strArray.length; i++) {
            temp = strArray[i];
            int j = i-1;
            while ((j>-1) && temp.compareTo(strArray[j])<0) {
                strArray[j+1] = strArray[j];
                j--;
            }
            strArray[j+1] = temp;
        }
		for(int i=0; i<strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
	}
}
