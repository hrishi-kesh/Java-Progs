class Demo
{
	static int count=0;
	Demo()
	{
		count++;
	}
}
class CountDemo
{
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(Demo.count);
		Demo d2=new Demo();
        System.out.println(Demo.count);
	}
}