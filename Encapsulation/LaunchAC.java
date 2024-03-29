class LaunchAC
{
	public static void main(String[] args) {
		AC ac=new AC();
		ac.setData(35);
		System.out.println(ac.getData());
	}
}
class AC
{
	private int temp;
	void setData(int x)
	{
		if(x>=17&&x=<32)
		{
			temp=x;
		}
		else
			System.out.println("invalid temp");
	}
	int getData()
	{
		return temp;
	}
}