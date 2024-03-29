class ChangeReturnType1//it shows error like add method already declare because of ambiguity
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int a, result; float b;
		a=10; b=10.10f;
		result=cal.add(a,b);
	}
}
class Calculator
{
	float temp;
	float add(int x, int y)
	{
		temp=x+y;
		return temp;
	}
	void add(int x, float y)
	{
		temp=x+y;
		System.out.println(temp);
	}
}