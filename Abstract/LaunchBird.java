import java.util.Scanner;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird
{
	abstract void eat 	void fly()
	{
		System.out.println("Eagle flies at high height");
	}
}
class GoldenEagle extends Eagle
{
	void eat()
	{
		System.out.println("Golden eagle eat fishes");
	}
}
class SerpantineEagle extends Eagle
{
	void eat()
	{
		System.out.println("Serpantine eagle eats snakes");
	}
}
class Sparrow extends Bird
{
	void eat()
	{
		System.out.println("Sparrow eats grains");
	}
	void fly()
	{
		System.out.println("Sparrow flies at low height");
	}
}
class Wing
{
	void permit(Bird ref)
	{
		ref.eat();
		ref.fly();
	}
}
class LaunchBird
{
	public static void main(String[] args) {
		GoldenEagle ge=new GoldenEagle();
		SerpantineEagle se=new SerpantineEagle();
		Sparrow s=new Sparrow();
		Wing w=new Wing();
		w.permit(ge);
		w.permit(se);
		w.permit(s);
	}
}