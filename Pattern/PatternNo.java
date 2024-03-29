import java.util.Scanner;
class PatternNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter Pattern No");
		int c=sc.nextInt();
		switch (c)
		{
			case 1: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(i+1);
				}
				System.out.println();
			}
			break;
			case 2: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(n-i);
				}
				System.out.println();
			}
			break;
			case 3: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(j+1);
				}
				System.out.println();
			}
			break;
			case 4: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(n-j);
				}
				System.out.println();
			}
			break;
			case 5:
			k=1;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(k);
					k++;
				}
				System.out.println();
			}
			break;
			case 6:
			k=n*n; 
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(k);
					k--;
				}
				System.out.println();
			}
			break;
			case 7: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print(i+1);
				}
				System.out.println();
			}
			break;
			case 8: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print(j+1);
				}
				System.out.println();
			}
			break;
			case 9: 
			for(i=0;i<n;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print(n-i);
				}
				System.out.println();
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<=n-i;j++)
				{
					System.out.print(i+1);
				}
				System.out.println();
			}
			break;
			case 10: 
			for(i=0;i<n;i++)
			{
				for(k=0;k<=i;k++)
				{
					System.out.print(" ");
				}
				for(j=0;j<=n-i;j++)
				{
					System.out.print(i+1);
				}
				System.out.println();
			}
			break;
		}
	}
}