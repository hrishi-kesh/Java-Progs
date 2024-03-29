import java.util.Scanner;
class Loan
{
	float p;
	float t;
	float r;
	float si;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p=scan.nextFloat();
		System.out.println("Enter the time duration");
		t=scan.nextFloat();
		r=2.0f;
	}
	void compute()
	{
		si=(p*t*r)/100;
	}
	void disp()
	{
		System.out.println(si);
	}
}
class LaunchLoan
{
	public static void main(String[] args) {
		Loan l1=new Loan();
		Loan l2=new Loan();
		Loan l3=new Loan();
	l1.input();
	l2.input();
	l3.input();

	l1.compute();
	l2.compute();
	l3.compute();

	l1.disp();
	l2.disp();
	l3.disp();

	}
}