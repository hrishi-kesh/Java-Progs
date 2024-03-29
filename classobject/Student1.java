class MainOutsideClass
{
	int id;
	String name;
}
class Student1
{
	public static void main(String[] args) {
		MainOutsideClass s1=new MainOutsideClass();
		System.out.println(s1.id+" "+s1.name);
	}
}