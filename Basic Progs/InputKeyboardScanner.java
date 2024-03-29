import java.util.Scanner;
class InputKeyboardScanner
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
      System.out.println("enter hobbies");

      String hobbies=sc.next();
      System.out.println("Your hobbies are"+hobbies);
	}
}