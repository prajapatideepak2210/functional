package com.bridgelabz.algorithms.mergeSort;

import java.util.Scanner;

class MergeSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want to insert : ");
		int size=sc.nextInt();
		int[] list=new int[size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0; i<size; i++)
		{
			list[i]=sc.nextInt();
		}
		int low=0;
		int high=list.length;
		MergeSort ms=new MergeSort();
		sort(list, low, high);
		
		//Printing Sorted Array
		for(int a : list)
		{
			System.out.print(a+" ");
		}
	}
	
	public static void sort(int[] a, int low, int high) 
    {
        int n=high-low;
        
        if(n<=1)
        {
        	return;
        }
        
        //dividing the array into sub Array
        int mid=low+n/2;
        sort(a, low, mid);
        sort(a, mid+1, high);
        
        //Sorting
        int[] tempList=new int[n];
        int i = low, j = mid;
        for (int k = 0; k < n; k++) 
        {
            if (i == mid)  
                tempList[k] = a[j++];
            else if (j == high) 
                tempList[k] = a[i++];
            else if (a[j]<a[i]) 
                tempList[k] = a[j++];
            else 
                tempList[k] = a[i++];
        }
        
        //reinserting into list
        for (int k = 0; k < n; k++) 
            a[low + k] = tempList[k];
    }
	
}