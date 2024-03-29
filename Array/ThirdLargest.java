class ThirdLargest
{
	static int getThirdLargest(int arr[], int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
				    arr[i]=arr[j];
                    arr[j]=temp;
				}
			}
		}
		return arr[total-3];
	}
public static void main(String[] args) {
	int arr1[]={2,4,6,8,10};
	int arr2[]={3,6,9,12,15};
	System.out.println("The third largest no. is "+getThirdLargest(arr1,5));
	System.out.println("The third largest no. is "+getThirdLargest(arr2,5));
}
}