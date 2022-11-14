abstract class Plane
{
	abstract void takeOff();
	abstract void flying();
}
class CargoPlane extends Plane
{
		void takeOff()
		{
			System.out.println("Plane is taking off");
		}
		void carryCargo()
		{
			System.out.println("Cargo plane carry cargo");
		}
		void flying()
		{
			System.out.println("cargo plane flying at low height");
		}
}
class LaunchPlane
{
	public static void main(String[] args) {

		CargoPlane cp=new CargoPlane();
		cp.takeOff();
		cp.carryCargo();
		cp.flying();
	}
}