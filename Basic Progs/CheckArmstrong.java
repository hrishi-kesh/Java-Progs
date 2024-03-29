import java.util.Scanner;
class CheckArmstrong
{
	public static void main(String[] args)
    {
		int a,b=0,t,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. ");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
        	a=n%10;
        	b=b+a*a*a;
        	n=n/10;
        }
        if(b==t)
        {
        	System.out.println(t+": is an armstrong no.");
        }
        else
        {
        	System.out.println(t+": is not an armstrong no.");
        }
	}
}