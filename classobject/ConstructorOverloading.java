class ConstructorOverloading
{
	int id;
	String name;
	int age;
ConstructorOverloading(int i,String n) //constructor with two args
{
	id=i;
	name=n;
}
ConstructorOverloading(int i, String n, int a)// constructor with three args
{
    id=i;
    name=n;
    age=a;
}
void display()
{
    System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
	    ConstructorOverloading s1=new ConstructorOverloading(101,"abc");
		ConstructorOverloading s2=new ConstructorOverloading(102,"xyz",15);
        s1.display();
        s2.display();
	}
}
