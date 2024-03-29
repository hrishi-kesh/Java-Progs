interface Calculator
{
   void mul();
}
class MyCalculator1
{
	void div()
	{
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
}
class MyCalculator2 extends MyCalculator1 implements Calculator
{
	public void mul()
	{
       int a=2;
       int b=3;
       int c=a*b;
       System.out.println(c);
	}
}
class Interface2
{
	public static void main(String[] args) {
		MyCalculator2 m2=new MyCalculator2();
		m2.mul();
		m2.div();
	}
}
