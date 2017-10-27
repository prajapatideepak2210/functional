package com.bridgelabz.functionalProgram.programs;

import java.util.Scanner;

import com.bridgelabz.functionalProgram.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int userOption;
		do
		{
			System.out.println("Please Enter 1 to start the watch, \n2 to stop the watch, \n3 to ellapse the time and \n4 to exit.");
			userOption=scanner.nextInt();
			switch(userOption) {
			case 1: 
				long startTime=Utility.startWatch();
				System.out.println("Start Time is : "+startTime);
				break;

			case 2: 
				long stopTime=Utility.stopWatch();
				System.out.println("Stop Time is : "+stopTime);
				break;

			case 3:
				long elapsesTime=Utility.elapses();
				System.out.println("Elapses Time is : "+elapsesTime);
				break;

			case 4:
				System.out.println("You have Exited.");
				System.exit(0);
			default:
				System.out.println("You have entered wrong choise.");
				break;
			}
		}
		while(userOption!=4);
	}
}
