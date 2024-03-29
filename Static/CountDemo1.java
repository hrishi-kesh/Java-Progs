class Demo
{
	String name;
	static int count=0;
	{
		count++;
	}
	Demo()
	{

	}
	Demo(String name)
	{
		this.name=name;
	}
}
class CountDemo1
{
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(Demo.count);
		Demo d2=new Demo("tommy");
		System.out.println(Demo.count);
	}
}