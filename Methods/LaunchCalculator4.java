class LaunchCalculator4
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		           int a=10;
		           int b=20;
		           int result=cal.add(a,b);
		           System.out.println(result) ;
	}
}
class Calculator
{
	int temp;
	int add(int x,int y)
	{
		temp=x+y;
        return temp;
	}
}
