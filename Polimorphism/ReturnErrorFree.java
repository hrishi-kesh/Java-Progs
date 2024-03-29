class Animal
{}
class Tiger extends Animal
{}
class Demo1
{
	Animal disp()
	{
		System.out.println("ABC");
		Animal a=new Animal();
		return a;
	}
}
class Demo2 extends Demo1
{
	Tiger disp()
	{
		System.out.println("ABC at Vij");
		Tiger t=new Tiger();
		return t;
	}
}
class ReturnErrorFree
{
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.disp();
	}
}