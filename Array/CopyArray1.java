class CopyArray1
{
	public static void main(String[] args) {
	int arr1[]=new int[] {2,4,6,8,10};
	int arr2[]=new int[arr1.length];
	System.out.println("original elements of the array are: ");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]+" ");
	} 
	System.out.println("elements of the array after copy are: ");
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=arr1[i];
		System.out.println(arr2[i]+" ");
	} 
	}
}