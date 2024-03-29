class Bed 
{
	String pillow;
	Bed(String pillow)
	{
		this.pillow=pillow;
	}
	String getColor()
	{
		return pillow;
	}
}
class Locker
{
	int lockerNo;
	Locker(int lockerNo)
	{
		this.lockerNo=lockerNo;
	}
	int getLocker()
	{
		return lockerNo;
	}
}
class Water
{
	int litre;
	Water(int litre)
	{
		this.litre=litre;
	}
	int getWater()
	{
		return litre;
	}
}
class Food
{
	int plateNo;
	Food(int plateNo)
	{
		this.plateNo=plateNo;
	}
	int getPlate()
	{
		return plateNo;
	}
}

class PG
{
	Bed b=new Bed("red");
	Locker l=new Locker(5);
	void hasA(Water w)
	{
		System.out.println(w.getWater());
	}
	void hasA(Food f)
	{
		System.out.println(f.getPlate());
	}
}
class LaunchPG
{
	public static void main(String[] args) {
	PG p=new PG();
    Water w=new Water(7);
    Food f=new Food(10);
    System.out.println(p.b.getColor());
    System.out.println(p.l.getLocker());
    System.out.println(w.getWater());
    System.out.println(f.getPlate());
    p.hasA(w);
    p.hasA(f);
}
}