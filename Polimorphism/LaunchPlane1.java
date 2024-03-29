class Plane
{
	void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	void flying()
	{
		System.out.println("Plane is flying");
	}
	void landing()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane
{
  void flying()
  {
  	System.out.println("Cargo plane flies at low height");
  }
  void carryCargo()
  {
  	System.out.println("Cargo plane carries goods");
  }
}
class PassengerPlane extends Plane
{
void flying()
{
	System.out.println("Passenger plane flies at medium height");
}
void carryPassenger()
{
	System.out.println("Passenger plane carries passengers");
}
}
class FighterPlane extends Plane
{
	void flying()
	{
		System.out.println("Fighter plane flies at high height");
	}
	void carryFighter()
	{
		System.out.println("Fighter Plane carries arms and ammination");
	}
}
class LaunchPlane1
{
	public static void main(String[] args)
	 {
		CargoPlane c=new CargoPlane();
		PassengerPlane p=new PassengerPlane();
		FighterPlane f=new FighterPlane();
	c.takeOff();
	c.flying();
	c.landing();
	c.carryCargo();

	p.takeOff();
	p.flying();
	p.landing();
	p.carryPassenger();

	f.takeOff();
	f.flying();
	f.landing();
	f.carryFighter();

	}
}
