import java.io.*;
class InputKeyboardBuffer
{
public static void main(String[] args)throws Exception 
{
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	System.out.println("enter the programming skills");
	String skills=br.readLine();//in readLine L is in uppercase
	System.out.println("your skills are "+skills);
}
}