class Demo1
{
	int a,b;
	Demo1()
	{
		a=10; 
		b=20;
	}
	Demo1(int x, int y)
	{
		a=x;
		b=y;
	}
}
class Demo2 extends Demo1
{
	int m,n;
	Demo2()
	{
		m=30; n=40;
	}
	Demo2(int p, int q)
	{
		m=p;
		n=q;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(m);
		System.out.println(n);
	}
}
class Inherit1
{
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.disp();
	}
}

