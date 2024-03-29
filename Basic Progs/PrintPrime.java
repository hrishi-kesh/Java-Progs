import java.util.Scanner;
class PrintPrime
{
	public static void main(String[] args) {
		System.out.println("enter the interval in between you want to print prime");
     Scanner sc=new Scanner(System.in);
     int start=sc.nextInt();
     int end=sc.nextInt();
     System.out.println("list of prime no. between "+start+" and "+end);
     for(int i=start;i<=end;i++)
     {
     if(isprime(i))
     {
     	System.out.println(i);
     }
 }
}
public static boolean isprime(int n)
     {
     	if(n<=1)
     	{
     		return false;
     	}
     	for(int i=2;i<=n/2;i++)
     	{
     		if(n%2==0)
     		{
     			return false;
     		}
     	}
     	return true;
     }
 }