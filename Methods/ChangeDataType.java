class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
}
class ChangeDataType
{
	public static void main(String[] args) {
		Adder ad=new Adder();
		System.out.println(ad.add(5,10));
		System.out.println(ad.add(5.5,10.10));

	}
}