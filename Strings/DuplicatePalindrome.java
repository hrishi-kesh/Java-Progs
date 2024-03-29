import java.util.*;
class DuplicatePalindrome
{
public static Boolean checkPalin(String word)
{
	int n=word.length();
	for(int i=0;i<n;i++)
	{
		if(word.charAt(i)!=word.charAt((n-1)-i))
		{
			return false;
		}
	}
	return true;
}
public static void duplicatePalin(String str)
{
	str=str+" ";
	String word[]=str.split("[.,]//s+");
	int count=0;
	for(int i=0;i<word.length;i++)
	{
		if(str.charAt(i)==' ')
			count++;
	}
	String palin[]=new String[100];
	for(int i=0;i<count;i++)
	{ int k=0;
		if(checkPalin(word[i]))
		{
			palin[k]=word[i];
		}
		k++;
	}
	for(int i=0;i<palin.length;i++)
	{ int c=0;
		for(int j=i+1;j<palin.length;j++)
		{
           if(palin[i]==palin[j])
           {
           	  c++;
            palin[j]="0";
           }
		}
		if(c>0&&palin[i]!="0")
		{
			System.out.print(palin[i]+" "+c);		
		}
	}
}
public static void main(String[] args) 
{
	duplicatePalin("madam arora madam abc malyalam abc malyalam");
}
}
