class Student
{
	int rollno;
	String name;
	static String clg="ITS";
	Student(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+clg);
	}
}
class StaticVar
{
	public static void main(String[] args) {
		Student s1=new Student(101,"abc");
		Student s2=new Student(102,"xyz");
		s1.display();
		s2.display();
	}
}