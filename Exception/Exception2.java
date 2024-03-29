import java.util.Scanner;
class Exception2
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Enter the array size");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element");
			int e=scan.nextInt();
			System.out.println("Enter the position in which element has to be inserted");
			int p=scan.nextInt();
			arr[p]=e;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter valid denominator");
		}
		catch(NegativeArraySizeException g)
		{
			System.out.println("Be positive");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("be in your limit");
		}
		catch(Exception h)
		{
			System.out.println("Invalid data");
		}
	}
}