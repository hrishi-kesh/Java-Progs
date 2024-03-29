class OS
{
	String name;
	OS(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
}
class Charger 
{
	String brand;
	Charger(String brand)
	{
		this.brand=brand;
	}
	String getBrand()
	{
		return brand;
	}
}
class Mobile
{
	OS os=new OS("ANDROID");
	void hasA(Charger c)
	{
		System.out.println(c.getBrand());
	}
}
class LaunchMobile
{
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger("Samsung");
		System.out.println(m.os.getName());
		System.out.println(c.getBrand());
		m.hasA(c);
		m=null;
		System.out.println(m.os.getName());
		m.hasA(c);
		System.out.println(c.getBrand());
	}
}