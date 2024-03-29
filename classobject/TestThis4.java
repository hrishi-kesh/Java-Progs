import java.util.Scanner;
class A
{
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		this.m();//this.m(); is same as m();
	}
}
class TestThis4//this: to invoke current class method
{
	public static void main(String[] args) {
	A obj=new A();
		obj.n();
	}
}
