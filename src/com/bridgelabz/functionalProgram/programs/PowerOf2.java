import java.util.Scanner;
public class PowerOf2
{
	public static void main(String [] args)
	{
		int power=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the power (between 0 to 31) : ");
		int n=sc.nextInt();
		if(n>0 && n<32)
		{
			for(int i=1; i<=n; i++)
			{
				power=power*2;
				System.out.println("2^"+i+" = "+power);
			}
		}
		else
			System.out.println("Please enter the power between 0-31.");
	}
}