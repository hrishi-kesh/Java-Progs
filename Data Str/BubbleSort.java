import java.util.Scanner;
class BubbleSort
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[100];
	int i=0;
	System.out.println("enter total no. of terms");
    int n=sc.nextInt();
	System.out.println("enter all the no. u want to sort ");
	for(i=0;i<n;i++)
	{
       a[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
	{
	if(a[j]>a[j+1])
	{
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
    }
    }
    System.out.println("the sorted nos. are: ");
    for(i=0;i<n;i++)
    {
    	System.out.printf("%d ",a[i]);
    }
    }
}
