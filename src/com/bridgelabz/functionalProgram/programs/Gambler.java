import java.util.Scanner;
public class Gambler
{
	public static void main(String [] args)
	{
		int win=0, loss=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the stake : ");
		int stake=sc.nextInt();
		System.out.print("Enter goals : ");
		int goals=sc.nextInt();
		System.out.print("Enter how many time you want to play : ");
		int trials=sc.nextInt();
		int cash=stake;
		
		for(int i=1; i<=trials; i++)
		{
			while(cash>0 && cash<goals)
			{
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goals)
				win++;
			else
				loss++;
		}
		System.out.println("Percent of game won = " + 100.0 * win / trials);
        System.out.println("Percent of game loss = " + 1.0 * loss / trials);
	}
}