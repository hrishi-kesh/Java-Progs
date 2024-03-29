class Dog
{
	private String name;
	private String breed;
	private int cost;
	Dog(String name,String breed,int cost)
	{
		this.name=name;
		this.breed=breed;
		this.cost=cost;
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
class ConstructorThis
{
	public static void main(String[] args) {
		Dog d=new Dog("tomy","lab",8000);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}