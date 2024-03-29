class Demo1
{
	int a;
	int b;
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
	int m;
	int n;
Demo2()
{
	m=30;
	n=40;
}
Demo2(int p, int q)
{
	super(33,44);
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
class Inherit3
{
	public static void main(String[] args) {
		Demo2 d=new Demo2(11,22);
		d.disp();
	}
}