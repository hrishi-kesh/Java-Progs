import java.util.Scanner;
class FactorialUsingRecursion
{
	public static int factorial(int n)
	{
		if(n==1)
		{
         return 1;
		}
		else
		{
          return(n*factorial(n-1));
		}
	}
	public static void main(String[] args)
	{
	 int n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter n");
	 n=sc.nextInt();
	 System.out.printf("factorial of %d is %d",n, factorial(n));	
	}
}