/*
Challenge
Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
Sample Test Cases
Input:"fun&!! time"

Output:time


Input:"I love dogs"

Output:love
*/
import java.util.Scanner;
class LongestWord
{
	public static String longestWord(String str)
	{
		String words[]=str.toLowerCase().split("[^a-zA-Z0-9]");
		int maxIndex=0;
		for(int i=1;i<words.length;i++)
		{
			if(words[i].length()>words[maxIndex].length())
			{
				maxIndex=i;
			}
		}
		return words[maxIndex];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(longestWord(sc.nextLine()));
	}
}