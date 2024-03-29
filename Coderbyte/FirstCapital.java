/*
Challenge
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space. 
Sample Test Cases
Input:"hello world"

Output:Hello World


Input:"i ran there"

Output:I Ran There
*/
import java.util.*; 
import java.io.*;

class FirstCapital {  
  public static String LetterCapitalize(String str) { 
  
  StringBuilder sb=new StringBuilder();
  for(String word : str.toLowerCase().split("\\s"))
  {
  	char firstLetter=word.substring(0,1).charAt(0);
  	sb.append(firstLetter>='a'&&firstLetter <='z' ?(char)(firstLetter-32):firstLetter).append(word.substring(1)).append(" ");
  }
  return sb.toString().substring(0,sb.toString().length()-1);
  } 
    
  public static void main (String[] args) {  

    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}
