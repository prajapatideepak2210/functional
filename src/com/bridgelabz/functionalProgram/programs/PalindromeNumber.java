package com.bridgelabz.algorithms.palindrome;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check palindrome : ");
		int num=sc.nextInt();
		
		String s1=Integer.toString(num);
		char copyOfnum[]=s1.toCharArray();
		
		int i=0, length=s1.length()-1;
		boolean isPalindrome=true;
		for(int j=0; j<s1.length(); j++)
		{
			if(copyOfnum[i]!=copyOfnum[length])
			{
				isPalindrome=false;
			}
			length--;
			i++;
		}
		if(isPalindrome)
		{
			System.out.println(num+" is Palindrome.");
		}
		else
			System.out.println(num+" is not Palindrome.");
	}
}
