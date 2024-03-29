class StudentInstanceVar
{
	int id;//we can declare instance variable without declare
	String name;
	char ch[]={'a','b','c'};
	public static void main(String[] args) {
		StudentInstanceVar s1=new StudentInstanceVar();
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s1.ch);
		System.out.println(s1.ch[2]);

	}
}