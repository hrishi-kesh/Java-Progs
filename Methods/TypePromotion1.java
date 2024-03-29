class TypePromotion1
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(10,20));
	}
}
class Calculator
{
	float temp;
	float add(int x, float y)
	{
		return x+y;
	}
	double add(float x, int y, double z)
	{
		return x+y;
	}
}