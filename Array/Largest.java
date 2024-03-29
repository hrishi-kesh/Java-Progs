class Largest
{
	public static void main(String[] args) {
		int arr[]={25,10,15,11,2};
		int i;
		int max=arr[0];
		System.out.println("the largest element of the array is: ");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}