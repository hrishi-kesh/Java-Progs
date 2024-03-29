class Dog
{
	private String name;
	private String breed;
	private int cost;
	
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
class DefaultConstructor
{
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}