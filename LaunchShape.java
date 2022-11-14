import java.util.*;
abstract class Shape
{
	float area;
	abstract void input();
	abstract void compute();
	void disp()
	{
		System.out.println("The area is"+area);
	}
}
class Square extends Shape
{
	float length;
	
		void input()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length:");
			length=sc.nextFloat();
	}
	void compute()
	{
		area=length*length;
	}
}
class Rectangle extends Shape
{
	float length,breadth;
	
		void input()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length:");
			length=sc.nextFloat();
			System.out.println("Enter breadth:");
			breadth=sc.nextFloat();
	}
	void compute()
	{
		area=length*breadth;
	}
}
class Circle extends Shape
{
	float radius;
	
		void input()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter radius:");
			radius=sc.nextFloat();
	}
	void compute()
	{
		area=3.14f*radius*radius;
	}
}
class Area
{
	void permit(Shape ref)
	{
		ref.input();
		ref.compute();
		ref.disp();
	}
}
class LaunchShape
{
	public static void main(String args[])
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Area a=new Area();
		a.permit(s);
		a.permit(r);
		a.permit(c);
	}

}