import java.util.Scanner;
class BinarySearch
{
	public static void main(String[] args) 
	{
		
		int i,j,li,hi,mi;
        int arr[]=new int[100];
		System.out.println("enter total no. of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter all elements of an array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        		int temp=arr[i];
        	        arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }ṇ
        System.out.println("the sorted element are: ");
        for(i=0;i<n;i++)
        {
        	System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the element you want to search: ");
        int k=sc.nextInt();
        li=0;
        hi=n-1;
        mi=(li+hi)/2;
        while(li<=hi)
        {
        if(arr[mi]==k)
        {
        	System.out.println("element is at "+mi+" index position");
        	break;
        }
        else if(arr[mi]<k)
        {
        	li=mi+1;
        }
        else
        {
        	hi=mi-1;
        }
        mi=(li+hi)/2;
    }
    }
}