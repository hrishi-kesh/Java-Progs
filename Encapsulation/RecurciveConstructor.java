class Dog
{
	String name;
	String color;
	int cost;

Dog (String name,String color, int cost)
{
	this();
	this.name=name;
    this.color=color;
    this.cost=cost;
}
String getName()
{
	return name;
}
String getColor()
{
	return color;
}
int getCost()
{
	return cost;
}
Dog()
{ 
	this();
	name="magi";
	color="brown";
	cost=3000;
}
Dog(String name)
{
	this.name=name;
}
}
class RecursiveConsructor
{
	public static void main(String[] args) {
		Dog d1=new Dog("tomy","white",5000);
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());

		Dog d2=new Dog();
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}