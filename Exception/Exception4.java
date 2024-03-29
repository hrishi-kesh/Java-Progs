import java.util.Scanner;
class Demo
{
	void fun() throws ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Connection 2 estabished");
		System.out.println("Enter numerator");
		int a=sc.nextInt();
		System.out.println("Enter denominator");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}
class Exception4
{
	public static void main(String[] args) {
		try
		{
			Demo d=new Demo();
			d.fun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("problem resolved in main");
			System.out.println("Connection terminated");
		}
	}
}