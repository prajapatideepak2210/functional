package com.bridgeLabz.functionalPrograms.stopWatch;

import java.util.Scanner;

public class SimulateStopWatch {
	long stop;
	long start;
	long elapses;
	public static void main(String[] args) {
		SimulateStopWatch sw=new SimulateStopWatch();
		sw.watch();
	}
	
	public void watch()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter 1 to start the watch, 2 to stop the watch, 3 to ellapse the time and 4 to exit.");
		int user=sc.nextInt();
		 switch(user) {
         default:
         case 1: 
        	 startWatch();
             break;

         case 2: 
        	 stopWatch();
             break;

         case 3:
        	 elapsedTime();
             break;
            
         case 4:
        	 System.out.println("You have Exited.");
        	 System.exit(0);
		 }
		 watch();
	}
	
	public void startWatch()
	{
		start=System.currentTimeMillis();
		System.out.println("Start time is : "+start);
	}
	
	public void stopWatch()
	{
		stop=System.currentTimeMillis();
		System.out.println("Stop time is : "+stop);
	}
	
	public long elapsedTime()
	{
		elapses=stop-start;
		System.out.println("Elapsed time is : "+elapses);
		return elapses;
	}
}
