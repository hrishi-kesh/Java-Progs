import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args) {
		int i,k,n;
		int arr[]=new int[100];
		System.out.println("enter the no. of elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter all elements of the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        k=sc.nextInt();
        i=0;
        while(i<n)
        {
        	if(k==arr[i])
        	{
        	System.out.println("element found at "+i+" position");	
        	}
            i++;
        }
	}
}