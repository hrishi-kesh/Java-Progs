import java.util.Scanner;
class PatternTestQ
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		for(i=0;i<n;i++)
		{
			while(i<n)
			{
			for(j=0;j<=i;j++)
			{ 
				if((i+2)%2==0)
				{
				System.out.print("*");
			}
			else
				System.out.print("$");
			}
		}
		System.out.println();
	  }
	}
}