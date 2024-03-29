class CopyString
{
	public static void main(String[] args) {
		String str="Hello Hrishikesh";
		char orig[]=str.toCharArray();
		char copy[]=new char[orig.length];
		int i;
		for(i=0;i<orig.length;i++)
		{
			copy[i]=orig[i];
		}
		for(i=0;i<orig.length;i++)
		{
		System.out.println(copy[i]);
	}
	System.out.println(copy);
	}
}