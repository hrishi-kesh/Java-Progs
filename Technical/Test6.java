class Test6
{
	public static void main(String[] args) {
		for(int i=1;i<=15;i++)
		{
			if(i%(3*5)==0)
			{
				System.out.println("A "+i);
			}
			else if(i%5==0)
			{
				System.out.println("B "+i);
			}
			else if(i%3==0)
			{
				System.out.println("C "+i);
			}
		}
	}
}