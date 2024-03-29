import java.util.Scanner;
class StringJackandJill2
{
	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
			{
				c++;
			}
		}
		String t="";
		int j=0;
		String arr[]=new String[c+1];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				t=t+s.charAt(i);
			}
			else if(s.charAt(i)==' ')
			{
				arr[j]=t;
				j++;
			    t="";
			}
			arr[j]=t;
		}
	for(int i=arr.length-1;i>=0;i--) 
	{
		System.out.println(arr[i]);
	}
}
}