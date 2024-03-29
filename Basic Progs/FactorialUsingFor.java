import java.util.Scanner;
class FactorialUsingFor
{
	public static void main(String[] args) 
	{
		int fact=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. greater than 0");
		n=sc.nextInt(); 
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.printf("Factorial of %d is: %d",n,fact);
	}
}