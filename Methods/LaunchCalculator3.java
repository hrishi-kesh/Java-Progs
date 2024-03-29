class LaunchCalculator3
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		           int result;
		           result=cal.add();
		           System.out.println(result) ;
		           //System.out.print(cal.add());
	}
}
class Calculator
{
	int a,b,c;
	int add()
	{
		a=10;
		b=20;
		c=a+b;
        return c;
	}
}
