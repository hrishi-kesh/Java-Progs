/* OUTPUT
student(1)=25
student(2)=23
student(3)=24
student(4)=21
student(5)=22
            */
import java.util.Scanner;
class Demo1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		System.out.println("enter the mark of each stutent");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.printf("The mark of each stutent is ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}