class BubbleSort
{
	public static void main(String[] args) {
		int arr[]={2,7,5,4,3};
		int i,j,temp=0;
		for(i=0;i<arr.length;i++)
		{
           for(j=0;j<arr.length-i-1;j++)
           {
           	if(arr[j]>arr[j+1])
           	{
           	temp=arr[j];
           	arr[j]=arr[j+1];
           	arr[j+1]=temp;
            }
           }
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}