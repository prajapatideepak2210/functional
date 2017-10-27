package com.bridgelabz.algorithms.vandingmachine;

import java.util.Scanner;

public class VendingMachine {
	static int total=0;
	static int a,b,c,d,e,f,g,h,i;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount : ");
		int amount=sc.nextInt();
		machine(amount);
		
		System.out.println("Total no of notes is : "+total);
		System.out.println("------------------------------");
		System.out.println("1000\t= "+a+"\n 500\t= "+b+"\n 100\t= "+c+"\n  50\t= "+d+
				"\n  20\t= "+e+"\n  10\t= "+f+"\n   5\t= "+g+"\n   2\t= "+h+"\n   1\t= "+i);
		
	}
	public static void machine(int amount)
	{
		if(amount>=1000)
		{
			total++;
			a++;
			amount=amount-1000;
			machine(amount);
		}
		else if(amount>=500)
		{
			total++;
			b++;
			amount=amount-500;
			machine(amount);
		}
		else if(amount>=100)
		{
			total++;
			c++;
			amount=amount-100;
			machine(amount);
		}
		else if(amount>=50)
		{
			total++;
			d++;
			amount=amount-50;
			machine(amount);
		}
		else if(amount>=20)
		{
			total++;
			e++;
			amount=amount-20;
			machine(amount);
		}
		else if(amount>=10)
		{
			total++;
			f++;
			amount=amount-10;
			machine(amount);
		}
		else if(amount>=5)
		{
			total++;
			g++;
			amount=amount-5;
			machine(amount);
		}
		else if(amount>=2)
		{
			total++;
			h++;
			amount=amount-2;
			machine(amount);
		}
		else if(amount>=1)
		{
			total++;
			i++;
			amount=amount-1;
			machine(amount);
		}
	}
}
