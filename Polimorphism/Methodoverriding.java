class Demo1//eroor due to visibility decreases
{
	public void disp()
	{
		System.out.println("ABC");
	}
}
class Demo extends Demo1
{
	void disp()
	{
		System.out.println("ABCians");
	}
} 
class MethodOverriding
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.disp();
	}
}
