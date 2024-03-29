import java.util.Scanner;
class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Banking started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter acc no.");
		int a=sc.nextInt();
		System.out.println("Enter pass");
		int b=sc.nextInt();
        System.out.println("Banking process completed");
	}
}
class Demo2 extends Thread
{
	public void run()
	{
System.out.println("Printing started");
try
{
	for (int i=0;i<5;i++)
	{
		System.out.println("April Fool");
		Thread.sleep(5000);
	}
	}
	catch (Exception e)
	{
		System.out.println("Dont interrupt");
	}
	System.out.println("Printing completed");
}
}
class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("Addition started");
		int a=10;
		int b=35;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition completed");
	}
}
class Thread3
{
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);

		t1.start();
		t2.start();
		t3.start();

	}
}