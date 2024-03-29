import java.util.Scanner;
class Apple
{
public static void main(String[] args) {
		String s1="What is the color of apple...?\n"+"1.red\n2.yellow\n3.blue\n4.green";
		String s2="What is the capital city of karnataka...?\n"+"1.mumbai\n2chennai\n3.mysure\n4.bengaluru";
		Quiz questions[]={new Quiz(s1,1),new Quiz(s2,4)};
		Quiz.takeTest(questions);
}
}
class Quiz
{
	String ques;
	int ans;
Quiz(String ques, int ans)
{
	this.ques=ques;
	this.ans=ans;
}
static void takeTest(Quiz questions[])
{
	int score=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<questions.length;i++)
{
	System.out.println(questions[i].ques);
	int ans=sc.nextInt();
	if(ans==questions[i].ans)
	{
		score++;
	}
}
System.out.println("you got "+score+"/"+questions.length);
}
}
