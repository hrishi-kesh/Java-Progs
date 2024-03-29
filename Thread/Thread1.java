import java.util.Scanner;
class Thread1
{
	public static void main(String[] args) {
		System.out.println("Booking process started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no");
		int a=sc.nextInt();
		System.out.println("Enter the password");
		int b=sc.nextInt();
		System.out.println("Booking process completed");
		System.out.println("Printing process started");
		try
		{
			for(int i=0;i<5;i++)
		{
			System.out.println("ABC");
			Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Don't interrupt");
		}
		System.out.println("Printing activity started");
		System.out.println("Addition activity started");
		int e=12;
		int g=15;
		int s=e+g;
		System.out.println(s);
		System.out.println("Addition activity completed");

	}
}