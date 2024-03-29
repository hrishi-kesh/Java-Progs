class CountPalindrome1
{
	static boolean checkPalin(String word)
	{
		int n=word.length();
		word=word.toLowerCase();
		for(int i=0;i<n;i++)
		{
			if(word.charAt(i)!=word.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}
	static int countPalin(String str)
	{
	    str=str+" ";
		String word="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else
			{
				if(checkPalin(word))
				{
					count++;
				}
				word="";
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(countPalin("Madam arora teaches malayalam"));
	}
}