import java.util.Scanner;
class HeapSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no. of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter all elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
void sort(int arr[])
{
 int leng=arr.length;
 for(int i=leng/2-1;i>=0;i--)
 {
 	heapify(arr,leng,i);
 }
 //swap the element and heapify again
 for(int i=leng-1;i>=0;i--)
 {
 	int temp=arr[0];
 	     arr[0]=arr[i];
 	     arr[i]=temp;
 	     heapify(arr,i,0);
 }
}
void heapify(int arr[],int n,int i)
{
	int largest=i; //parent node index position
	int li=2*i+1;  //left child node index position
	int Ri=2*i+2;   //right child node index position
	if(li<n && arr[li]>arr[largest])
	{
		largest=li;
	}
	if(Ri<n && arr[Ri]>arr[largest])
	{
		largest=Ri;
	}
	if(largest!=i)
	{
		int temp=arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		heapify(arr,n,largest);

	}
}
void printArray(int arr[])
{
 for(int i=0;i<arr.length;i++)
 {
 	System.out.println(arr[i]+" ");
 }
}
}