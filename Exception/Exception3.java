import java.util.Scanner;
class Demo
{
	void fun() throws ArithmeticException
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Connection 2 established");
			System.out.println("Enter numerator");
			int a=sc.nextInt();
			System.out.println("Enter the denominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Problem resolved in fun");
			throw e;
		}
		finally
		{
			System.out.println("Connection2 terminated");
		}
	}
}
class Exception3
{
	public static void main(String[] args) {
		System.out.println("connection1 is established");
		try
		{
			Demo d=new Demo();
			d.fun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("return resolved in main()");
			System.out.println("connection terminated");
		}
	}
}