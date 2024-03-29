import java.util.Scanner;
class Farmer
{
	float p;
	float t;
	static float r;
	float si;
	static
	{
        r=2.0f;
	}
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p=scan.nextFloat();
		System.out.println("Enter the time duration");
		t=scan.nextFloat();
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
    class LaunchLoan1
    {
    	public static void main(String[] args) {
    		Farmer f1=new Farmer(); 
    		Farmer f2=new Farmer(); 
    		Farmer f3=new Farmer(); 
    		f1.input();
            f2.input();
            f3.input();

            f1.compute();
            f2.compute();
            f3.compute();

            f1.disp();
            f2.disp();
            f3.disp();

    	}
    }