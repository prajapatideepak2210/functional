package com.bridgelabz.algorithms.binarySearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchForString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=null;
		//Reading the file
		try {
			FileReader fr=new FileReader("/home/bridgeit/eclipse-workspace/Deepak Programs/Program files/Binary Search");
			BufferedReader br=new BufferedReader(fr);
			str=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Sorted String
		
		String str1=str.replaceAll(",", "");
		String[] str2=str1.split(" ");
		String temp;
		
		System.out.println("Sorted List :-");
		System.out.print("\n--------------------------------");
		for(int i=0; i<str2.length-1; i++)
		{
			for(int j=i+1; j<str2.length; j++)
			{
				if(str2[j].compareTo(str2[i])<0)
				{
					temp=str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
			}
		}
		for(int i=0; i<str2.length; i++)
		{
			System.out.println(str2[i]);
		}
		System.out.println("\n--------------------------------");
		System.out.print("Enter the String to search : ");
		String search=sc.next();
		
		//Searching
		int first=0, last=str2.length, middle=(first+last)/2;
		while(first<=last)
		{
			if(str2[middle].compareTo(search)>0)
			{
				last=middle-1;
			}
			else if(str2[middle].compareTo(search)==0)
			{
				System.out.println("Your Search "+search+" found at index "+middle);
				break;
			}
			else
			{
				first=middle+1;
			}
			middle=(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("Your search "+search+" is not found in the list.");
		}
	}
}
