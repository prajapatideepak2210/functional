import java.util.Random;
import java.util.Scanner;
public class FlipCoin
{
	public static void main(String [] args)
	{
		int head=0, tail=0;
		double headPer=0.0, tailPer=0.0;
		Random rdm=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nomber of flips : ");
		int flip=sc.nextInt();
		for(int i=0; i<flip; i++)
		{
			double random=rdm.nextInt()*1;
			if(random<0.5)
			{
				tail++;
			}
			else
				head++;
		}
		headPer=(head*100)/flip;
		tailPer=(tail*100)/flip;
		System.out.println(headPer);
		System.out.println(tailPer);
	}
}