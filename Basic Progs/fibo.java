import java.util.Scanner;
class fibo
{
	public static void main(String[] args) {
		int i=1,t1=0,t2=1,sum;
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the first "+n+" terms are:" );
        while(i<=n)
        {
            System.out.printf("%d ",t1);	
         sum=t1+t2;
         t1=t2;
         t2=sum;
         i++;
        }
	}
}