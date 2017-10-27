import java.util.Scanner;
public class SumOfIntegers
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many number you want to give : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<size-2; i++)
		{
			for(int j=i+1; j<size-1; j++)
			{
				for(int k=j+1; k<size; k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						count++;
					}
				}
			}
		}
		System.out.println("Total Triples are "+count);
	}
}