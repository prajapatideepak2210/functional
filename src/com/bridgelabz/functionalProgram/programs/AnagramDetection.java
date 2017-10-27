package com.bridgelabz.algorithms.anagram;

import java.util.Scanner;

public class AnagramDetection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str1=sc.nextLine();
		System.out.println("Enter the second String : ");
		String str2=sc.nextLine();
		
		
		checkAnagram(str1, str2);
	}
	
	public static void checkAnagram(String str1, String str2)
	{	
		boolean isAnagram=true;
		
		if(str1.length()!=str2.length())
		{
			isAnagram=false;
		}
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.indexOf(str2.charAt(i))==-1)
			{
				isAnagram=false;
				
			}
			
		}
		
		if(isAnagram==false)
		{
			System.out.println(str1+" and "+str2+" are not Anagram.");
		}
		else
		{
			System.out.println(str1+" and "+str2+" are Anagram.");
		}
	}
	
	/*static void isAnagram(String s1, String s2)
    {
 
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            status = false;
        }
        else
        {
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);
        }
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }*/
 
}
