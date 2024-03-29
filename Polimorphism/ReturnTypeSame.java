class Demo1// disp() in Demo cannot override disp() because int is not compatible with void
{
	void disp()
	{
		System.out.println("April batch is very intelligent");
	}
}
class Demo extends Demo1
{
	int disp()
	{
		return Good ;
	}
}
class ReturnTypeSame
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.disp();
	}
}