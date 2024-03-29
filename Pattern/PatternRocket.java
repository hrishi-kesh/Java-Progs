import java.util.Scanner;
class PatternRocket
{
	public static void main(String[] args) {
	System.out.println("enter n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
         System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(i+j==n-1)
			{
              System.out.print("*");
             }
             else
             	System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(i==j)
			{
              System.out.print("*");
             }
             else
             	System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
              System.out.print(" ");
		}
		System.out.println();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i+j==n-1&&i>=n/2
				|| i==j && j>=n/2)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(j==0)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(j==n-1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(i+j==n-1&& i>=n/2
				||i==j && i>=n/2)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(j==0 && j==n-1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
         System.out.print(" ");
		}
		for(j=0;j<n;j++)
		{
			if(j==0 && j==n-1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
  }
}