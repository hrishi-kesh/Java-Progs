import java.util.Arrays;
import java.util.Scanner;
class Anagram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1 and string 2");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
   if(str1.length()!=str2.length())
   {
   	System.out.println("Strings are not Anagram");
   }
   str1=str1.toLowerCase();
   str2=str2.toLowerCase();
   char a[]=str1.toCharArray();
   char b[]=str2.toCharArray();
   Arrays.sort(a);
   Arrays.sort(b);
boolean result=Arrays.equals(a,b);
if(result==true)
{
	System.out.println("both strings are Anagram");
	}
	else
		System.out.println("both are not Anagram");
}
}