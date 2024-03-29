class TypePromotion2_1
{
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		float m=10.10f, n=20.10f, o=30.10f;
		double p=10.111, q=20.112, r=30.113;
		TypePromotion2_1 tp=new TypePromotion2_1();
        float result1=tp.add(m,n,o);
        float result2=tp.add(a,m,c);
        double result3=tp.add(p,n);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
}
	float add(float x, float y, float z)
	{
		return x+y+z;
	}
	float add(int x, float y, int z)
	{
		return x+y+z;
	}
	double add(double x, float y)
	{
		return x+y;
	}
}
