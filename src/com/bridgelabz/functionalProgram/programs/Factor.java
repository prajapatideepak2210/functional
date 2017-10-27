import java.util.Scanner;
public class Factor
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int i=2;
		System.out.print("Prime Factors of "+num+" is : ");
		while(num>1)
		{
			if(num%i==0)
			{
			num=num/i;
			System.out.print(i+", ");
			}
			else
			{
				i++;
			}
		}
	}
}