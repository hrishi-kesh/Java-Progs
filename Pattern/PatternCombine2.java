import java.util.Scanner;
class PatternCombine2
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("$");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1 || i==0||j==0||i==n-1||j==n-1)
				{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==n/2 || j==n/2||i==0||j==0||i==n-1||j==n-1)
				{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1 || i==0||j==0||i==n-1||j==n-1)
				{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}