import java.util.Scanner;
public class ReplaceString
{
	public static void main(String[] args)
	{
		System.out.println("Please enter the usernamr : ");
		Scanner sc=new Scanner(System.in);
		String str1="Hello <<UserName>>, How are you?";
		String str2=sc.nextLine();
		String str3=str1.replace("<<UserName>>", str2);
		System.out.println(str3);
	}
}