import java.util.Scanner;
class Fibo
{
	public static void main(String[] args) {
		int i,j,t1=0,t2=1,sum=0;
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int k=n;
           System.out.print("Fibonacci series of 1st"+n+"terms are ");
           while(k>0)
           {
           	
           sum=t1+t2;
           t1=t2;
           t2=sum;
           k--;
           System.out.print(t1+" ");
       }

    }
}