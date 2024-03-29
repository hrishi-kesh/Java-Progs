import java.util.Scanner;
class Exception1
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Connection established");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=sc.nextInt();
			System.out.println("Enter denominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter valid denominator");
		}
		System.out.println("Connection is established");
	}
}