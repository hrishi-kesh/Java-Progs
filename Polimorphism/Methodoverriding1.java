class Demo1//eroor due to visibility decreases
{
	void disp()
	{
		System.out.println("ABC");
	}
}
class Demo extends Demo1
{
	public void disp()
	{
		System.out.println("ABCians");
	}
} 
class MethodOverriding1
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.disp();
	}
}
