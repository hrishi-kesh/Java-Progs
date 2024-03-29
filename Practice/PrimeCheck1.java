import java.util.Scanner;
class PrimeCheck1
{
	public static void main(String[] args) {
	System.out.println("enter n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int flag=0;
	if(n==0||n==1)
	{
		System.out.println("entered no. is not prime");
	}
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("entered no. is not prime");
		flag=1;
		break;
		}
	}
	if(flag==0)
	{
		System.out.println("entered no. is prime");
	}
	}
}