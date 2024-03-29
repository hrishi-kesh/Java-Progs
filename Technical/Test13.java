class Test13
{
	public static void main(String[] args) {
		String a="Abcforjava";
		String b=new String(a);
		int value =0;
		value=(a==b)?1:2;
		if(value==1)
		{
			System.out.println("Spider");
		}
		if(value==2)
		{
			System.out.println("ABC");
		}
		else
			System.out.println("none of the above");
	}
}