import java.util.Scanner;
public class CouponNumber
{
	public static void main(String [] args)
	{
		System.out.println("Program Started.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many coupon do you want : ");
		
		int coupon=sc.nextInt();
		checkCoupons(coupon);
		System.out.println(coupon+" coupons are available.");
		System.out.println("Program Ended.");
	}
	
	private static int checkCoupons(int num)
	{
        int[] collection = new int[num];  
        int count = 0;                          
        
		int coupons=0;
        while (count < num-1) {
            int value = getCoupon(count);           
            count++;
			int i=0;
			i++;
            while(i<=num && collection[i-1]!=value) {          
				if(coupons<num)
				{
					collection[coupons] = value;
					coupons++;
				}
            }
        }
		
        return count;
    }
	
	private static int getCoupon(int num)
	{
		CouponNumber cn=new CouponNumber();
		int a=(int) (Math.random() * num);
		return a;
	}
}