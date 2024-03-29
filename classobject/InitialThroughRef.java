class Student
{
	int id;
	String str;
}
class InitialThroughRef
{
	public static void main(String[] args) {
		Student st=new Student();
		st.id=100;
		st.str="abc";
		System.out.println(st.id+" "+st.str);
	}
}