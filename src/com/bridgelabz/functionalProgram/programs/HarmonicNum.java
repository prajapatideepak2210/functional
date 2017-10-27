import java.util.Scanner;
public class HarmonicNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Harmonic value : ");
		
		int n = sc.nextInt();
		
		float result=0.0f;
		for(int i=1;i<=n;i++)
		{
			result=result+1.0f/i;
		}
		System.out.println("Harmonic Number is : "+result);
	}
}