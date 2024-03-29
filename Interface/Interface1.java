import java.util.Scanner;
interface Calculator
{
	void mul();
	void div();
}
class MyCalculator1 implements Calculator
{
	public void mul()
	{
		int a=40;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		int a=40;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
}
class MyCalculator2 implements Calculator
{
	public void mul()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=scan.nextInt();
		System.out.println("Enter 2nd no.");
		int b=scan.nextInt();
		int c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=scan.nextInt();
		System.out.println("Enter 2nd no.");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}
class MyCalculator3 implements Calculator
{
	public void mul()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=scan.nextInt();
		System.out.println("Enter 2nd no.");
		int b=scan.nextInt();
		if(a==0||b==0)
		System.out.println("invalid data");
	     else
	    {
	    	int c=a*b;
		System.out.println(c);
	    }
	}
	public void div()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=scan.nextInt();
		System.out.println("Enter 2nd no.");
		int b=scan.nextInt();
		if(b==0)
		System.out.println("invalid data");
	    else
	    {
	    	int c=a/b;
		System.out.println(c);
	    }
	}
}
class Maths
{
	void permit(Calculator ref)
	{
		ref.mul();
		ref.div();
	}
}
class Interface1
{
	public static void main(String[] args) {
		MyCalculator1 m1=new MyCalculator1();
		MyCalculator2 m2=new MyCalculator2();
		MyCalculator3 m3=new MyCalculator3();
		Maths m=new Maths();
		m.permit(m1);
		m.permit(m2);
		m.permit(m3);
	}
}