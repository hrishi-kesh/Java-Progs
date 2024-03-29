import java.util.Scanner;
class FactorialUsingWhile
{
	public static void main(String[] args) 
	{
		int fact=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. greater than 0");
		n=sc.nextInt();
		int t=n; 
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.printf("Factorial of %d is: %d",t,fact);
	}
}