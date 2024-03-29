class ABC/*using a parent class we can access the inherited method and overriden method
         present in child class but using a parent ref it is not possible too access
         specialized method presend in child class. */
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
	void lough()
	{
		System.out.println("child lough");
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
class PolimorphicWay2
{
	public static void main(String[] args) {
	Child1 c1=new Child1();
	Child2 c2=new Child2();
	Child3 c3=new Child3();
	ABC ref;
	ref=c1;
	ref.cry();
	ref.lough();
	ref=c2;
	ref.cry();
	ref=c3;
	ref.cry();	
	}
}