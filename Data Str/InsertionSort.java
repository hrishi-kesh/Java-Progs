import java.util.Scanner;
class InsertionSort
{
	public static void main(String[] args) {
		System.out.println("Enter the total no. of elements");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int i,j,k,temp;
       System.out.println("Enter all elements of the array");
       for( i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
       for(i=1;i<n;i++)
       {
          temp=arr[i];
          j=i-1;
          while(j>=0 && temp<=arr[j])
          {
          	arr[j+1]=arr[j];
          	j=j-1;
          }
          arr[j+1]=temp;
       }
       System.out.print("After insertion the new array is: ");
       for(i=0;i<n;i++)
       {
       	System.out.print(arr[i]+" ");
       }
	}
}