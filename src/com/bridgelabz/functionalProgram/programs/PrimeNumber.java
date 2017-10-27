package com.bridgelabz.algorithms.prime;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int a=1; a<=1000; a++)
		{
			int num = a, count=0;

			for (int i = 1; i <= num; i++)
			{
				count = 0;
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count++;
						break;
					}
				}
			}
			
			if(count==0)
			{
				System.out.println(a+" is prime number.");
			}
		}
	}
}
