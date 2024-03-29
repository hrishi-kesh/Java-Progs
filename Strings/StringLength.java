class StringLength
{
	public static void main(String[] args) {
		String str="hello abc";
		str=str.concat("\0");
		char arr[]=str.toCharArray();
		int count=0;
		int i=0;
		while(arr[i]!='\0')
		{
			count++;
			i++;
		}
		System.out.println("The length of "+str+"is: "+count);
		System.out.println(arr[8]);
	}
}