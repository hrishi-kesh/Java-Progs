public class PermuteString
{
	public static String swapString(String a, int i, int j)
	{
		char b[]=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	public static void main(String[] args)
	{
		String str="ABC";
		int len=str.length();
		System.out.println("All the permutation of the string are:");
		generatePermutation(str,0,len);
	}
	public static void generatePermutation(String str,int start, int end)
	{
		if(start==end-1)
		System.out.println(str);
	else
	{
		for(int i=start; i<end ;i++)
		{
			//swapping the string by fixing a char
			str=swapString(str, start, i);
			//recursive calling function generate permutation() for rest of chars
			generatePermutation(str, start+1, end);
			str=swapString(str, start, i);
		}
	}
	}
}