import java.util.Scanner;
class InputWithoutArithmaticOperator
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter input1 & input2");
    int input1=sc.nextInt();
	int input2=sc.nextInt();
	int sum=0;
	int carry=0;
	while(input2!=0)
	{
		sum= input1 ^ input2;
		carry=input1 & input2;
		input1=input1 ^ input2;
		input2=carry<<1;
	}
System.out.printf("%d", sum);
	}
}