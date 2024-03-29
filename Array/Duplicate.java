class Duplicate
{
	public static void main(String[] args) {
		int arr[]={2,4,5,2,5,7};
		System.out.println("duplicate element of the array are: ");
		for (int i=0;i<arr.length;i++)
		 {
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{

                System.out.println(arr[j]);

			}
		}	
		}
	}
}