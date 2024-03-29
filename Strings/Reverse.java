import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a[]=str.toCharArray();
        String rev="";
        String rev1="";
		for(int i=str.length()-1;i>=0;i--)
		{
		           rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		for(int j=a.length-1;j>=0;j--)
		{
		           rev1=rev1+a[j];
		}
		System.out.println(rev1);//without using charAt
	}
}