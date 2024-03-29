import java.util.Scanner;
class SelectionSort
{
	public static void main(String[] args)
	{
	int i=0,temp=0,j=0;
	int a[]=new int[100];
	System.out.println("enter total no. terms");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter all no.");
    for (i=0;i<n;i++)
    {
    a[i]=sc.nextInt();	
    }
    for (i=0;i<n;i++)
    {
    for(j=i+1;j<n;j++)
    {
    if(a[i]>a[j])
    {
    	temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }	
    }
	}
	System.out.println("The elements are after SelectionSort; ");
	for (i=0;i<n;i++)
	{
	System.out.printf("%d ",a[i]);	
	}
}
}