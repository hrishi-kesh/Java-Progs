class ABC
{
	void cry()
	{
		System.out.println("Parent is criying");
	}
}
class Child1 extends ABC
{
	void cry()
	{
		System.out.println("child cries at low voice");
	}
}
class Child2 extends ABC
{
	void cry()
	{
		System.out.println("child cries at medium voice");
	}
}
class Child3 extends ABC
{
	void cry()
	{
		System.out.println("child cries at high voice");
	}
}
class NormalWay
{
	public static void main(String[] args) {
	Child1 c1=new Child1();
	Child2 c2=new Child2();
	Child3 c3=new Child3();
	c1.cry();
	c2.cry();
	c3.cry();	
	}
}