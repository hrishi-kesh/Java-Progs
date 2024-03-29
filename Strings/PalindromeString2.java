import java.util.Scanner;
class PalindromeString2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		checkPalindrome(sc.nextLine());
}
static void checkPalindrome(String str)
{
	String rev="";
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		if(str.equals(rev))
		{
			System.out.println("Strings is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
}
}