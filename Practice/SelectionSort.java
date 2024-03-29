class SelectionSort
{
	public static void main(String[] args) 
	{
	 	int arr[]={2,7,3,9,4};
	 	int i,j,temp=0;
	 	for(i=0;i<arr.length;i++)
	 	{
	 		for(j=i+1;j<arr.length;j++)
	 		{
	 			if(arr[i]>arr[j])
	 			{
	 				temp=arr[i];
	 				arr[i]=arr[j];
	 				arr[j]=temp;
	 			}
	 		}
	 	}
	 	for(i=0;i<arr.length;i++)
	 	{
	 		System.out.print(arr[i]+" ");
	 	}
	}
}