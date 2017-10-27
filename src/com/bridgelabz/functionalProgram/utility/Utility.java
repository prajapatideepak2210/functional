package com.bridgelabz.algorithms.sortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Here you will found some algorithams.");
		System.out.println("\nPlease enter 1 to Binary Search For Integer.\nenter 2 to Binary Search For String.");
		System.out.println("enter 3 to Insertion Sort For Integers. \nenter 4 to InsertionSort for String.");
		System.out.println("enter 5 to Bubble Sort For Integers.\nenter 6 to Bubble Sort For String.");
		System.out.print("\nPlease any one frome above : ");
		int userChoise=sc.nextInt();
		
		
			switch(userChoise)
			{
			case 1:
				binarySearchForInteger();
				break;

			case 2:
				binarySearchForString();
				break;

			case 3:
				insertionSortForInteger();
				break;

			case 4:
				insertionSortForString();
				break;

			case 5:
				bubbleSortForInteger();
				break;

			case 6:
				bubbleSortForString();
				break;
				
			default:
				System.out.println("\nYou have entered wrong choise, please try again next time.");
				break;
			}
		
		
		System.out.println("Thanks For Using.");
	}
	
	//Binary Search For Integer
	public static void binarySearchForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Binary Search :-\n");
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    int num= sc.nextInt(); 
	    int array[] = new int[num];
	 
	    System.out.println("Enter " +num+ " integers");
	    
	    for (int i=0; i<num; i++)
	    {
	      array[i]=sc.nextInt();
	    }
	    System.out.println("Enter value to find");
	    int search = sc.nextInt();
	    
	    int first=0, last=num-1, middle=(first + last)/2;
	    
	    while(first<=last)
	    {
	      if (array[middle]<search)
	        first = middle + 1;    
	      else if(array[middle]==search) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	    }
	    
	   if (first>last)
	      System.out.println(search + " is not present in the list.\n");
	   long stopTime=System.currentTimeMillis();
	   long ellapseTime=stopTime-startTime;
	   System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	//Binary Search For String
	public static void binarySearchForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Binary Search :-\n");
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of elements : ");
	    int num= sc.nextInt(); 
	    String array[] = new String[num];
	 
	    System.out.print("Enter " +num+ " Strings : ");
	 
	    for (int i=0; i<num; i++)
	    {
	      array[i]=sc.next();
	    }
	    
	    Arrays.sort(array);
	    System.out.print("------------------------------------\n");
	    System.out.print("Enter String to find : ");
	    String search = sc.next();
	    
	    System.out.print("------------------------------------\n");
	    System.out.print("Sorted List : ");
	    int i=1;
	    for(String a : array)
	    {
	    	System.out.print(i+"."+a+" ");
	    	i++;
	    }
	    System.out.print("\n------------------------------------\n");
	    int first=0, last=num-1, middle=(first+last)/2;
	    while(first<=last)
	    {
	    	if(array[middle].compareTo(search)<0)
	    	{
	    		first=middle+1;
	    	}
	    	else if(array[middle].compareTo(search)==0)
	    	{
	    		System.out.println(search + " found at location " + (middle + 1) + ".");
	    		break;
	    	}
	    	else
	    	{
	    		last=middle-1;
	    	}
	    	middle=(first+last)/2;
	    }
	    if (first>last)
		      System.out.println(search + " is not present in the list.\n");
	    
	    long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	//Insertion Sort For Integer
	public static void insertionSortForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Insertion Sort :-\n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of elements : ");
		int num=sc.nextInt();
		System.out.println("Enter "+num+" Numbers : ");
		int array[] = new int[num];
		for(int i=0; i<num; i++)
		{
			array[i]=sc.nextInt();
		}
		
		int temp;
		
		for (int i = 1; i < num; i++) {
            temp = array[i];
            int j = i-1;
            while ( (j > -1) && ( array [j] > temp ) ) {
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = temp;
        }
		
		for(int k=0; k<num; k++)
		{
			System.out.println(array[k]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	//Insertion Sort for String
	public static void insertionSortForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Insertion Sort :-\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		char[] s2=s.toCharArray();
		
		char temp;
		for (int i = 1; i < s2.length; i++) {
            temp = s2[i];
            int j = i-1;
            while ((j>-1) && temp < s2[j]) {
                s2[j+1] = s2[j];
                j--;
            }
            s2[j+1] = temp;
        }
	    
		for(int i =0; i<s2.length; i++)
		{
			System.out.print(s2[i]);
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	//Bubble Sort for Integer
	public static void bubbleSortForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Bubble Sort :-\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element : ");
		int num=sc.nextInt();
		
		int [] arrayForBbl=new int[num];
		System.out.println("Enter "+num+" numbers : ");
		for(int i=0; i<num; i++)
		{
			arrayForBbl[i]=sc.nextInt();
		}
		
		//Sorting
		int temp;
		for(int i=0; i<num-1; i++)
		{
			for(int j=i+1; j<num; j++)
			{
				if(arrayForBbl[i]>arrayForBbl[j])
				{
					temp=arrayForBbl[i];
					arrayForBbl[i]=arrayForBbl[j];
					arrayForBbl[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted List : ");
		for(int i=0; i<num; i++)
		{
			System.out.print(arrayForBbl[i]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	//Bubble Sort For String
	public static void bubbleSortForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Bubble Sort :-\n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str1=sc.next();
		char str2[]=str1.toCharArray();
		System.out.println("-------------------------");
		//Sorting
		char temp;
		for(int i=0; i<str2.length-1; i++)
		{
			for(int j=i+1; j<str2.length; j++)
			{
				if(str2[i]>str2[j])
				{
					temp=str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
			}
		}
		System.out.print("Sorted List : ");
		for(int i=0; i<str2.length; i++)
		{
			System.out.print(str2[i]);
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
}
