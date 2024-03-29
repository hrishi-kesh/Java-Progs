import java.io.Console;
class InputKeyboardConsole
{
	public static void main(String[] args) 
	{
		Console con=System.console();// in System.console always in samall c
		System.out.println("enter programming skills");
		String skills=con.readLine();// in readLine L is in capital
		System.out.println("your skills are"+skills);
    }
}
