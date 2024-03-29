class Student
{
	int rollno;
	String name;
	void insertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInfo()
	{
		System.out.println(rollno+" "+name);
	}
}
class InitialThroughMeth
{
	public static void main(String[] args) 
	{
		Student st1=new Student();
		Student st2=new Student();
		st1.insertRecord(101,"abc");
		st2.insertRecord(102,"xyz");
		st1.displayInfo();
		st2.displayInfo();
      }
}