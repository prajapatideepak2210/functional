import java.util.Scanner;
import java.io.PrintWriter;
public class TwoDArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		pw.write("Enter the no of rows : ");
		pw.flush();
		int rows=sc.nextInt();
		pw.write("Enter the no of columns : ");
		pw.flush();
		int columns=sc.nextInt();
		int twoDarray[][]=new int[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				pw.print(twoDarray[i][j]);
				pw.flush();
			}
		}
		
		pw.close();
	}
}