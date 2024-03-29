import java.util.Scanner;
class Guesser
{
	int gNum;
	int guessNum()
	{
		System.out.println("Guesser kindly guess one Number");
		Scanner scan=new Scanner(System.in);
        gNum=scan.nextInt();
        return gNum;
        	}
}
class Player
{
	int pNum;
	int guessNum()
	{
		System.out.println("Player kindly guess one Number");
		Scanner scan=new Scanner(System.in);
		pNum=scan.nextInt();
		return pNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
void collectNumFromGuesser()
{
	Guesser g=new Guesser();
	numFromGuesser=g.guessNum();
}
void collectNumFromPlayer()
{
	Player P1=new Player();
	Player P2=new Player();
	Player P3=new Player();
	numFromPlayer1=P1.guessNum();
	numFromPlayer2=P2.guessNum();
	numFromPlayer3=P3.guessNum();
}
void compare()
{
	if ((numFromGuesser==numFromPlayer1)&&(numFromGuesser==numFromPlayer2)&&(numFromGuesser==numFromPlayer3)) {
    	System.out.println("All three are winner");
    }
    else if ((numFromGuesser==numFromPlayer1)&&(numFromGuesser==numFromPlayer2)) {
    	System.out.println("Player1 & player2 both are winner");
    }
    else if ((numFromGuesser==numFromPlayer2)&&(numFromGuesser==numFromPlayer3)) {
    	System.out.println("Player2 & player3 both are winner");
    }
    else if ((numFromGuesser==numFromPlayer3)&&(numFromGuesser==numFromPlayer1)) {
    	System.out.println("Player3 & player1 both are winner");
    }
    else if (numFromGuesser==numFromPlayer1) {
    	System.out.println("Player1 is winner"); 
    }
   else if (numFromGuesser==numFromPlayer2) {
    	System.out.println("Player2 is winner"); 
    }
    else if (numFromGuesser==numFromPlayer3) {
    	System.out.println("Player3 is winner"); 
    }
    else
    {
    	System.out.println("Repeat the game"); 
    }
}
}
class Game
{
   public static void main(String[] args) {
   		Umpire u=new Umpire();
   		u.collectNumFromGuesser();
   		u.collectNumFromPlayer();
   		u.compare();
   	}	
}