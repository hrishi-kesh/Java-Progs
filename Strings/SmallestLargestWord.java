import java.util.Scanner;
public class SmallestLargestWord
{
	public static void main(String[] args)
	{
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String word="",small="",large="";
		String words[]=new String[100];
		int length=0;
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else
			{
				words[length]=word;
				length++;
				word="";
			}
		}
		small=large=words[0];
		for(int k=0;k<length;k++)
		{
			if(small.length()>words[k].length())
			{
				small=words[k];
			}
			if(large.length()<words[k].length())
			{
				large=words[k];
			}
		}
		System.out.println("Smallest word: "+small);
		System.out.println("Largest word: "+large);
	}
}