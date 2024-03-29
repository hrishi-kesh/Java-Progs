class Switch1
{
 public static void main(String[] args) {
 
	final int x=10;
	final int y=20;

	switch (x)  //if x is not final it gives error
	{
		case x:
		System.out.println("Hello");
		break;
		case y:
		System.out.println("ABC");
		break;
	}
}
}