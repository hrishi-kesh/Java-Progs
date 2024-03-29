class TypePromotionIfMatch
{
	void sum(int a, int b)
	{
		System.out.println(a+b+" int arg method invoked");
	}
	void sum(long a, long b)
	{
		System.out.println(a+b+"long arg method invoked");
	}
	public static void main(String[] args) {
	TypePromotionIfMatch tp=new TypePromotionIfMatch();
	tp.sum(5,10);
}
}