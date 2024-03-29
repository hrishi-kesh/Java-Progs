import java.util.Scanner;
class Fibonacci 
{
   public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i = 1, t1 = 0, t2 = 1;
        System.out.println("enter n ");
        int n =sc.nextInt();
        System.out.print("First " + n + " terms: ");

        while (i<=n)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}