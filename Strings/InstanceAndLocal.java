class Dog
{
	String name;
	String breed;
	int cost;
}
class InstanceAndLocal
{
	public static void main(String[] args) {
		//int a;   local variables have to initialize first
		//int b;
		//int c;
		int a=1;
		int b=2;
		int c=3;
		Dog d=new Dog();
		System.out.println(d.name);
		System.out.println(d.breed);
		System.out.println(d.cost);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}