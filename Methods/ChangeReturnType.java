class Adder//it shows error because of ambuigity
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(int a, int b)
	{
		return a+b;
	}
}
class ChangeReturnType
{
	public static void main(String[] args) {
		Adder ad=new Adder();
		System.out.println(ad.add(5,10));
		System.out.println(ad.add(5,10));
	}
}