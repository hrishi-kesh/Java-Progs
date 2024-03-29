import java.util.Scanner;//it;s import scanner class which is in java<utility
class CheckPalindriome
{
	public static void main(String[] args)

    {
		int rev=0,rem, actual, temp;
        Scanner sc=new Scanner(System.in);/*create object of scanner class which present inside java.util which allows
        user to read values of various types. and system.in is inputstream which is connected to keybord*/
        System.out.println("enter the no.");
        actual=sc.nextInt();//this method scan the next token of the input as an integer
        temp=actual;
        while(temp>0)
        {
        	rem=temp%10;
        	rev=rev*10+rem;
        	temp=temp/10;

        }
        if(rev==actual)
        	System.out.println("no. is palindrome");
        else
        	System.out.println("no. is not palindrome");
        

	}
}