import java.util.Scanner;
class StringHelloWithPlus
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				t=t+"+"+s.charAt(i);
			}
			else
				t=t+s.charAt(i);
		}
		System.out.println(t);
	}
}