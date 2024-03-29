class Student
{
	int rollno;
	String name;
	Float fee;
Student(int rollno, String name, float fee)
{
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
void display()
{
	System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis2
{
	public static void main(String[] args) {
       Student S1=new Student(101, "abc", 10.1f);
       Student S2=new Student(102, "mno", 10.2f);
       S1.display();
       S2.display();
	}
}
