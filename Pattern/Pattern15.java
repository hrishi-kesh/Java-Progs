/*
*****
*   *
*   *
*   *
*****
*   *
*   *
*   *
*   *
*   * 
    */
import java.util.Scanner;
class Pattern15
{
	static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
         for(int j=0;j<n;j++)
         {
         	if(j=0||j=n/2
         		i==0&& j<n/2
         		i==n/2&&j<=n/2)
         	{
         		System.out.print("*");
         	}
         	else
         	{
         		System.out.print(" ");
         	}
         }
         System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of n");
		int n=in.nextInt();
		pattern(n);
	}
}