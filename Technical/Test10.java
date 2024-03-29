import java.util.Scanner;
class Test10
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter case 1 or case 2");
		switch (s.nextInt())
		{
			case 1:
			{
				Float f=(float)(1/4)*10;
				int i=Math.round(f);

				System.out.println(i);
			}
			break;
			case 2:
			{
				Float f=(1/4f)*10;
				int i=Math.round(f);
				System.out.println(i);
			}
			break;
			default :
			{
			System.out.println("u didn't enter valid case");
			break;
		}
		}

	}
}