class Vibrate
{
	static String s="Hero";
Vibrate()
{
	s+="Heroine";
}
}
class Echo extends Vibrate
{
	Echo()
	{
		this(7);
		s+="Villain";
	}
	Echo(int x)
	{
		s+="Comedian";
	}

	public static void main(String[] args) {
		System.out.println("Movie"+s+"");
	}
		static
		{
			Echo e=new Echo();
			System.out.println("Location"+s+"");

		}
}