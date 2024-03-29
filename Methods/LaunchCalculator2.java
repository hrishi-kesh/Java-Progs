class LaunchCalculator2
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		           int a,b;
		           a=10;b=20;
		           cal.add(a,b); 
	}
}
class Calculator
{
	int temp;
	void add(int x,int y)
	{
     temp=x+y;
     System.out.println(temp);
	}
}
