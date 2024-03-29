class CountPalindrome
{
static boolean checkPalin(String word)
{
	int n=word.length();
	word=word.toLowerCase();
	for(int i=0;i<n;i++)
	{
		if(word.charAt(i)!=word.charAt((n-1)-i))
			return false;
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
		char ch=str.charAt(i);
	if(ch!=' ')
		word=word+ch;
	else
	{
		if(checkPalin(word))
			count++;
		word="";
	}
}
return count;
}
public static void main(String[] args) {
	 System.out.println(countPalin("Madam Arora teaches malayalam")); 
                    
        System.out.println(countPalin("Nitin "
                        + "speaks malayalam")); 
}
}