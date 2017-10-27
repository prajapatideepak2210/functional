package com.bridgelabz.algorithms.anagramNum;

import java.util.Scanner;

public class AnagramNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2=sc.nextInt();
		
		String s1=Integer.toString(num1);
		char copyOfnum1[]=s1.toCharArray();
		String s2=Integer.toString(num2);
		char copyOfnum2[]=s2.toCharArray();
		
		boolean checkAnagram=true;
		
		if(s1.length()!=s2.length())
		{
			checkAnagram=false;
		}
		else
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.indexOf(s2.charAt(i))==-1)
				{
					checkAnagram=false;
				}
			}
		}
		
		if(checkAnagram)
		{
			System.out.println(num1+" and "+num2+" is Anagram.");
		}
		else
		{
			System.out.println(num1+" and "+num2+" is not Anagram.");
		}
		
	}
}
