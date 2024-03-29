import java.util.Scanner;
class StringMangalam
{
	public static void main(String[] args) 
	{
Scanner scan=new Scanner(System.in);
String s= scan.nextLine();
String t="";
for(int i=0;i<s.length();i++)
		{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
	t=t+"+"+s.charAt(i);
			}
		else 
			{
			t=t+s.charAt(i);
			}
		}
			System.out.println(t);
	}
}