class LaunchCalculator4_1
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		           int a=10;
		           int b=20;
		           System.out.println(cal.add(a,b)) ;
		           System.out.println(cal.add1(a,b)) ;
		           System.out.println(cal.add2(a,b));
		           System.out.println(cal.add3(a,b));
	}
}
class Calculator
{
	int temp;
	int a=90;
	int b=10;
	
	int add(int x,int y)
	{
		temp=x+y;
        return temp;
     }
    int add1(int a,int b)
	{
		a=40;
		b=10;
		temp=this.a+this.b;
        return temp;
	}
	int add2(int a,int b)
	{
		a=40;
		b=10;
		temp=a+b;
        return temp;
	}
	int add3(int x,int y)
	{
		x=30;
		y=40;
		temp=x+y;
        return temp;
	}
}
