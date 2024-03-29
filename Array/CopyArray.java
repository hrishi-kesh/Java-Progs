import java.util.Scanner;
class CopyArray
{
	public static void main(String[] args) {
		int arr1[]=new int[100];
		int arr2[]=new int[100];

		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no. of terms of arr1 ");
		int n=sc.nextInt();
		System.out.println("enter elements of arr1[] are: ");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("elements of the arr2[] are: ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
	}
}