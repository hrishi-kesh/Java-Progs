class Largest
{
	public static void main(String args[])
	{
	int i,j,temp=0;
	int arr[]={2,7,3,4,5};
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
    System.out.println("Largest="+arr[arr.length-1]);
	}
}