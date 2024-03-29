class TypePromotionAmbiguity// it shows error because of ambiguity
{
	void sum(int a, long b)
	{
		System.out.println(a+b+" a method invoked");
	}
	void sum(long a, int b)
	{
		System.out.println(a+b+" b method invoked");
	}
	public static void main(String[] args) {
	TypePromotionAmbiguity tp=new TypePromotionAmbiguity();
	tp.sum(10,20);
}
}