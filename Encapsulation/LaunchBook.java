class LaunchBook// Encapsulation prog
{
 public static void main(String[] args) {
 	Book b=new Book();
 	b.setData(100);
 	System.out.println(b.getData());
 }
}
class Book
{
	private int pg_no;
	void setData(int x)
	{
		if(x>0)
		{
			pg_no=x;
		}
		else
		{
			System.out.println("Invalid page no.");
		}
	}
	int getData()
	{
		return pg_no;
	}

}