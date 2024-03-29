class Dog
{
	private String name;
	private String breed;
	private int cost;
	Dog(String x,String y,int z)
	{
		name=x;
		breed=y;
		cost=z;
	}
	String getName()
	{
        return name;
	}
	String getBreed()
	{
        return breed;
	}
	int getCost()
	{
        return cost;
	}
}
class LaunchDogConstructor
{
	public static void main(String[] args) {
		Dog d=new Dog("tomy","lab",8000);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}